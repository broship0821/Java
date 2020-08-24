package exjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExJdbc05 {

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		
		//pstmt는 sql문 먼저 삽입, 삽입때 바인딩 문자 사용 가능
		sql.append("insert into SUBJECT ");
		sql.append("values (SUBJECT_SEQ.nextval, ?, ?, ?)"); //?: 바인딩 문자
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		ConnectionUtil jdbcTemplate = ConnectionUtil.getInstance();
		
		try {
//			conn = jdbcTemplate.getConnection();
			conn = ConnectionUtil.getInstance().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 2); //첫번째 ?
			pstmt.setString(2, "자바");//두번째 ?
			pstmt.setFloat(3, 60.9f);//세번째 ?
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
