package service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

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
		
		try {
			conn = ConnectionUtil.getConnection();
			pstmt = conn.prepareStatement("insert into EXERCISE values(?,?,?,?,?,?,?,sysdate)");
			pstmt.setInt(1, ex.getPull_up());
			pstmt.setInt(2, ex.getHspu());
			pstmt.setInt(3, ex.getPush_up());
			pstmt.setInt(4, ex.getSamdu());
			pstmt.setInt(5, ex.getDips());
			pstmt.setInt(6, ex.getDumbbell_curl());
			pstmt.setInt(7, ex.getChin_up());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) try {pstmt.close();} catch(SQLException e) {}
			if(conn != null) try {conn.close();} catch(SQLException e) {}
		}
	}
	
	public void checkDayRecord(LocalDate regdate) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = ConnectionUtil.getConnection();

			String sql = "select * form EXERCISE where REGDATE = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setDate(1, Date.valueOf(regdate));
			/*
			 LocalDate를 Date형식으로 바꿔서 sql문에 대입
			 이렇게 하면 날짜를 매개변수로 db에서 꺼내오는거 쌉가능?
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
				
				Exercise ex = new Exercise(pull_up, hspu, push_up, samdu, dips, dumbbell_curl, chin_up);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try {rs.close();} catch(SQLException e) {}
			if(pstmt != null) try {pstmt.close();} catch(SQLException e) {}
			if(conn != null) try {conn.close();} catch(SQLException e) {}
		}
	}
	
}
