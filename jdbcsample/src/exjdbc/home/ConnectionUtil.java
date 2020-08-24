package exjdbc.home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {
	private static ConnectionUtil instance = new ConnectionUtil();
	
	private ConnectionUtil() {}
	
	private static String IP_ADDRESS = "localhost";
	private static String USERNAME = "c##scott";
	private static String PASSWORD = "tiger";
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static ConnectionUtil getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(
					"jdbc:oracle:thin:@" + IP_ADDRESS
					+ ":1521:xe",USERNAME, PASSWORD
				);
	}
	
	public void closeConnection(Connection conn) {
		try {
			if(conn!=null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void closeConnection(Statement stmt) {
		try {
			if(stmt!=null) stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void closeConnection(ResultSet rs) {
		try {
			if(rs!=null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
