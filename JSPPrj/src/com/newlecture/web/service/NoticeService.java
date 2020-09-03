package com.newlecture.web.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

public class NoticeService {

	//목록을 표시하는 메서드(초기값, 기본값)
	public List<NoticeView> getNoticeList() {
		
		return getNoticeList("title", "", 1);
	}
	//클릭된 해당 페이지를 표시하는 메서드
	public List<NoticeView> getNoticeList(int page) {
		
		return getNoticeList("title", "", page);
	}
	//검색을 통한 페이지를 표시하는 메서드
	//오버로딩 메서드라 맨 밑에것만 작성
	public List<NoticeView> getNoticeList(String field/*TITLE, WRITER_ID*/, String query/*A*/, int page) {
		List<NoticeView> list = new ArrayList<>();
		String sql ="SELECT * FROM (" + 
				"    SELECT ROWNUM NUM, N.*" + 
				"    FROM (SELECT * FROM NOTICE_VIEW WHERE " + field + " LIKE ? ORDER BY REGDATE DESC) N" + 
				") " + 
				"WHERE NUM BETWEEN ? AND ?";
		//두번째? 등차수열: 1, 6, 11, 16 -> an= 1+(page-1)*5
		//세번째? 한 페이지당 5개씩: 5, 10, 15, 20 -> page*5
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "peter", "0821");
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, "%"+query+"%"); //문자열을 넣으면 ''으로 감싸여져서 넣어짐
			pstmt.setInt(2, 1+(page-1)*5);
			pstmt.setInt(3, page*5);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("ID");
				String title = rs.getString("TITLE");
				Date regdate = rs.getDate("REGDATE");
				String writerId = rs.getString("WRITER_ID");
				int hit = rs.getInt("HIT");
				String files = rs.getString("FILES");
				//String content = rs.getString("CONTENT");
				int cmtCount = rs.getInt("CMT_COUNT");
				
				NoticeView notice = new NoticeView(
						id,
						title,
						regdate,
						writerId,
						hit,
						files,
						//content,
						cmtCount
						);
				list.add(notice);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	//---------------------------------------------------------
	
	//목록 개수 표시하는 메서드(총페이지, 현재 페이지 표시함)
	public int getNoticeCount() {
		
		return getNoticeCount("title", "");
	}
	//검색된 목록 개수 표시하는 메서드
	public int getNoticeCount(String field, String query) {
		int count = 0;
		
		String sql ="SELECT COUNT(ID) COUNT FROM (" + 
				"    SELECT ROWNUM NUM, N.*" + 
				"    FROM (SELECT * FROM NOTICE WHERE " + field + " LIKE ? ORDER BY REGDATE DESC) N" + 
				") ";
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "peter", "0821");
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, "%"+query+"%");
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) count = rs.getInt("count");
			
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return count;
	}
	//---------------------------------------------------------
	
	//클릭된 현재 공지사항 (자세한 페이지 들어갈때 하나의 노티스만 반환)
	public Notice getNotice(int id) {
		Notice notice = null;
		
		String sql = "SELECT * FROM NOTICE WHERE ID=?";
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "peter", "0821");
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int nId = rs.getInt("ID");
				String title = rs.getString("TITLE");
				Date regdate = rs.getDate("REGDATE");
				String writerId = rs.getString("WRITER_ID");
				int hit = rs.getInt("HIT");
				String files = rs.getString("FILES");
				String content = rs.getString("CONTENT");
				
				notice = new Notice(
						nId,
						title,
						regdate,
						writerId,
						hit,
						files,
						content
						);
				
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return notice;
	}
	//다음 공지사항
	public Notice getNextNotice(int id) {
		Notice notice = null;
		
		String sql = "SELECT * FROM NOTICE " + 
				"WHERE ID=(" + 
				"    SELECT ID FROM NOTICE WHERE REGDATE > (SELECT REGDATE FROM NOTICE WHERE ID=?) " + 
				"AND ROWNUM=1" + 
				")";

		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "peter", "0821");
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int nId = rs.getInt("ID");
				String title = rs.getString("TITLE");
				Date regdate = rs.getDate("REGDATE");
				String writerId = rs.getString("WRITER_ID");
				int hit = rs.getInt("HIT");
				String files = rs.getString("FILES");
				String content = rs.getString("CONTENT");
				
				notice = new Notice(
						nId,
						title,
						regdate,
						writerId,
						hit,
						files,
						content
						);
				
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return notice;
	}
	//이전 공지사항
	public Notice getPrevNotice(int id) {
		Notice notice = null;
		
		String sql = "SELECT * FROM NOTICE " + 
				"WHERE ID=( " + 
				"    SELECT ID " + 
				"    FROM (SELECT * FROM NOTICE ORDER BY REGDATE DESC) " + 
				"    WHERE REGDATE < (SELECT REGDATE FROM NOTICE WHERE ID=?) " + 
				"    AND ROWNUM=1 " + 
				")";

		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "peter", "0821");
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int nId = rs.getInt("ID");
				String title = rs.getString("TITLE");
				Date regdate = rs.getDate("REGDATE");
				String writerId = rs.getString("WRITER_ID");
				int hit = rs.getInt("HIT");
				String files = rs.getString("FILES");
				String content = rs.getString("CONTENT");
				
				notice = new Notice(
						nId,
						title,
						regdate,
						writerId,
						hit,
						files,
						content
						);
				
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return notice;
	}
	
}
