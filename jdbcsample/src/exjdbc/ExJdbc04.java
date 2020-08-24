package exjdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExJdbc04 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@192.168.6.128:1521:xe";
		String username = "scott";
		String password = "tiger";
		
		StringBuffer sql = new StringBuffer();
		sql.append("select * from MEMBER");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, username, password);
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql.toString());
			
			while(rs.next()) {
				int num = rs.getInt("NUM");
				String id = rs.getString("ID");
				int pw = rs.getInt("PW");
				String name = rs.getString("NAME");
				Date regdate = rs.getDate("REGDATE");
				
//				System.out.println("NUM: " + num);
//				System.out.println("ID: " + id);
//				System.out.println("PW: " + pw);
//				System.out.println("NAME: " + name);
//				System.out.println("DATE: " + regdate);
//				System.out.println("--------------------");
				
				System.out.println(name + "님의 등록날짜는 " + regdate + "입니다.");
			}
			
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null)	conn.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

}
