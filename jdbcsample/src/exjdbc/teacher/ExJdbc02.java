package exjdbc;

import java.sql.*;
public class ExJdbc02 {
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append("update MEMBER ");
		sql.append("set PW='4321' ");
		sql.append("where ID='hgd'");
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
                               "jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result+" 행이 수정되었습니다.");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
