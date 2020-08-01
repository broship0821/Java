package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String sql = "SELECT * FROM NOTICE WHERE HIT>=10";
		//자바에 if문써서 가져오는 방법도 있지만 sql문장써서 먼저 필터링하고, 그 결과를 자바에서는 사용만 하는게 효율적임
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "peter", "0821"); //아이디 비번 까먹음
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt("ID");
			String title = rs.getString("TITLE");
			String WriterId = rs.getString("WRITER_ID");
			Date regDate = rs.getDate("REGDATE");
			String content = rs.getString("CONTENT");
			int hit = rs.getInt("HIT");
			
			System.out.printf("id: %d\n", id);
			System.out.printf("title: %s\n", title);
			System.out.printf("WriterId: %s\n", WriterId);
			System.out.printf("regDate: %s\n", regDate);
			System.out.printf("content: %s\n", content);
			System.out.printf("hit: %d\n", hit);
			System.out.println("------------------");
			
		}
		
		rs.close();
		st.close();
		con.close();

	}

}
