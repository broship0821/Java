package exjdbc.home;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ConnectionUtil jdbcTemplate = ConnectionUtil.getInstance();
		
		StringBuffer sql = new StringBuffer();
		sql.append("select * from MEMBER where NUM=3");
		
		try {
			conn = jdbcTemplate.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			
			Member m1 = new Member();
			
			while(rs.next()) {
				m1.setNum(rs.getInt("NUM"));
				m1.setId(rs.getString("ID"));
				m1.setPw(rs.getString("PW"));
				m1.setName(rs.getString("NAME"));
				m1.setRegdate(rs.getDate(5));
			}
			System.out.println(m1);
			//일단 MemberDao도 메인에 만들기
			//메인에 insert, select등 구현해보고
			//다른 클래스로 빼보기
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
