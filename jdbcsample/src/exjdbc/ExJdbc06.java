package exjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 Join:
 	여러 테이블에서 값을 가져와서 조립하는 개념
 */
public class ExJdbc06 {

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append("select a.NAME, a.NUM, b.SUB_NAME, b.SUB_SCORE ");
		sql.append("from MEMBER a, SUBJECT b ");
		sql.append("where a.NUM = b.MEM_NUM and a.NUM=?");
		//?: 내가 원하는 회원 번호
		System.out.println(sql.toString());
		
		ConnectionUtil jdbcTemplate = ConnectionUtil.getInstance();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = jdbcTemplate.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, 2); //2번 회원에 대한 과목과 점수 정보
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString(1) + "\t"); //a.NAME
				System.out.print(rs.getInt(2) + "\t"); //a.NUM
				System.out.print(rs.getString(3) + "\t"); //b.SUB_NAME
				System.out.print(rs.getDouble(4) + "\t"); //b.SUB_SCORE
				System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcTemplate.closeConnection(rs);
			jdbcTemplate.closeConnection(pstmt);
			jdbcTemplate.closeConnection(conn);
		}

	}

}
