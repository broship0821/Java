package exjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExJdbc05 {
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into SUBJECT ");
		sql.append("values (SUBJECT_SEQ.nextval, ?, ?, ?)");
		ConnectionUtil jdbcTemplate = ConnectionUtil.getInstance();
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = jdbcTemplate.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, 2);
			pstmt.setString(2, "자바");
			pstmt.setFloat(3, 87.9f);
			int n = pstmt.executeUpdate();
			System.out.println(n + "행이 삽입되었습니다.");	
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			jdbcTemplate.closeConnection(pstmt);
			jdbcTemplate.closeConnection(conn);
		}
	}
}
