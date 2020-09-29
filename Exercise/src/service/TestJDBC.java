package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "c##scott";
		String password = "tiger";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
			
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("DB접속 성공");
			
			stmt = conn.createStatement();
			
			StringBuffer sql = new StringBuffer();
			
			sql.append("select * from EXERCISE");
			ResultSet rs = stmt.executeQuery(sql.toString());
			
			if(rs.next()) {
				System.out.println(rs.getInt(1));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
