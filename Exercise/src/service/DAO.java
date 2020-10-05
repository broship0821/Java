package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	
	public int test() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = 0;
		
		try {
			conn = ConnectionUtil.getConnection();
			pstmt = conn.prepareStatement("select * from EXERCISE");
			rs = pstmt.executeQuery();
			if(rs.next()) x = rs.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try {rs.close();} catch(SQLException e) {}
			if(pstmt != null) try {pstmt.close();} catch(SQLException e) {}
			if(conn != null) try {conn.close();} catch(SQLException e) {}
		}
		return x;
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
	
}
