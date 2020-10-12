package service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entity.Exercise;

public class DAO {
	private static DAO instance = null;
	private DAO() {}
	public static DAO getInstance() {
		if(instance==null) {
			synchronized (DAO.class) {
				instance = new DAO();
			}
		}
		return instance;
	}
	
	public void insertRecord(Exercise ex) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		//여기서 년,월,일만 넣어야됨, 그게 되나?
		LocalDate regdate = LocalDate.now();
		//일단 추가는 성공
		try {
			conn = ConnectionUtil.getConnection();
			pstmt = conn.prepareStatement("insert into EXERCISE values(?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, ex.getPull_up());
			pstmt.setInt(2, ex.getHspu());
			pstmt.setInt(3, ex.getPush_up());
			pstmt.setInt(4, ex.getSamdu());
			pstmt.setInt(5, ex.getDips());
			pstmt.setInt(6, ex.getDumbbell_curl());
			pstmt.setInt(7, ex.getChin_up());
			pstmt.setDate(8, Date.valueOf(regdate));
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) try {pstmt.close();} catch(SQLException e) {}
			if(conn != null) try {conn.close();} catch(SQLException e) {}
		}
	}
	
	public Exercise checkDayRecord(LocalDate regdate) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Exercise ex = null;
		
		try {
			conn = ConnectionUtil.getConnection();

//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
//			String date = regdate.format(formatter);
			
			System.out.println(regdate.toString());
			
			String sql = "select * from EXERCISE where regdate<?";
			pstmt.setString(1, regdate.toString());
			pstmt = conn.prepareStatement(sql);
			/*
			 LocalDate를 Date형식으로 바꿔서 sql문에 대입
			 이렇게 하면 날짜를 매개변수로 db에서 꺼내오는거 쌉가능?
			 
			 어떻게든 날짜로 꺼내오려는데 문제 생김
			 sql 디벨로퍼에서 날짜로 꺼내오는거 연구해보기
			 
			 1. 아예 추가할때 여기서 년,월,일만 저장
			 2. 비교(<,>) 써서 일주일치씩 꺼내오기
			 
			 */
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int pull_up = rs.getInt("pull_up");
				int hspu = rs.getInt("hspu");
				int push_up = rs.getInt("push_up");
				int samdu = rs.getInt("samdu");
				int dips = rs.getInt("dips");
				int dumbbell_curl = rs.getInt("dumbbell_curl");
				int chin_up = rs.getInt("chin_up");
//				Date date = rs.getDate("regdate");
				
				ex = new Exercise(pull_up, hspu, push_up, samdu, dips, dumbbell_curl, chin_up);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try {rs.close();} catch(SQLException e) {}
			if(pstmt != null) try {pstmt.close();} catch(SQLException e) {}
			if(conn != null) try {conn.close();} catch(SQLException e) {}
		}
		
		return ex;
	}
	
}
