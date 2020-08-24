package exjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {
	//싱글톤으로 jdbc관련 메서드 쉽게 사용하기 
	private static ConnectionUtil instance = new ConnectionUtil();
	
	//생성자가 private: 외부에서 객체 생성 불가
	private ConnectionUtil() {
		
	}
	
	private static String USERNAME = "scott";
	private static String PASSWORD = "tiger";
	private static String IP_ADDRESS = "192.168.6.128";
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//객체 참조 반환
	public static ConnectionUtil getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@" + IP_ADDRESS + ":1521:xe",
				USERNAME,
				PASSWORD);
	}
	
	public void closeConnection(Connection conn) {
		try {
			if(conn!=null) {
				conn.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void closeConnection(Statement stmt) {
		try {
			if(stmt!=null) {
				stmt.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void closeConnection(ResultSet rs) {
		try {
			if(rs!=null) {
				rs.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
