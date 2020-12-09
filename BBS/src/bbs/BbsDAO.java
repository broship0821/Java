package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BbsDAO {
	
	private Connection conn;
	private ResultSet rs;
	
	public BbsDAO() {
		try {
//			String dbURL = "jdbc:mysql://localhost:3306/BBS";
//			String dbID = "root";
//			String dbPW = "root";
			String dbURL = "jdbc:mysql://192.168.10.130:3306/bbs";
			String dbID = "broship";
			String dbPW = "broship";
//			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPW);
 		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//현재 시간 가져오는 함수
	public String getDate() {
		String sql = "SELECT NOW()";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next())
				return rs.getString(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ""; //db 오류 
	}
	
	//게시글 번호 가져오는 함수
	public int getNext() {
		String sql = "SELECT bbsID FROM bbs ORDER BY bbsID DESC";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next())
				return rs.getInt(1)+1;
			return 1; //첫번째 게시글인 경우
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; //db 오류 
	}
	
	//게시글 db에 저장하는 함수
	public int write(String bbsTitle, String userID, String bbsContent) {
		String sql = "INSERT INTO bbs VALUES(?,?,?,?,?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, getNext());
			pstmt.setString(2, bbsTitle);
			pstmt.setString(3, userID);
			pstmt.setString(4, getDate());
			pstmt.setString(5, bbsContent);
			pstmt.setInt(6, 1);
			return pstmt.executeUpdate(); //성공하면 0이상의 int 반환
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; //db 오류 
	}
	
	public ArrayList<Bbs> getList(int pageNumber){
		String sql = "SELECT * FROM bbs WHERE bbsID < ? AND bbsAvailable = 1 ORDER BY bbsID DESC LIMIT 10";
		ArrayList<Bbs> list = new ArrayList<Bbs>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, getNext() - (pageNumber-1)*10);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Bbs b = new Bbs(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
				list.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public boolean nextPage(int pageNumber){
		String sql = "SELECT * FROM bbs WHERE bbsID < ? AND bbsAvailable = 1";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, getNext() - (pageNumber-1)*10);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Bbs getBbs(int bbsId){
		String sql = "SELECT * FROM bbs WHERE bbsID  = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bbsId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				Bbs b = new Bbs(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
				return b;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int update(int bbsID, String bbsTitle, String bbsContent) {
		String sql = "UPDATE bbs SET bbsTitle=?, bbsContent=? WHERE bbsID=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bbsTitle);
			pstmt.setString(2, bbsContent);
			pstmt.setInt(3, bbsID);
			return pstmt.executeUpdate(); //성공하면 0이상의 int 반환
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; //db 오류 
	}
	
	public int delete(int bbsID) {
		String sql = "UPDATE bbs SET bbsAvailable=0 WHERE bbsID=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bbsID);
			return pstmt.executeUpdate(); //성공하면 0이상의 int 반환
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; //db 오류 
	}
	
	
}
