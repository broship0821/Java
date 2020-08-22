package exjdbc.home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExJdbc01 {

	public static void main(String[] args) {
		
		Connection conn = null; //접속할때 필요한거
		Statement stmt = null; //쿼리문 전달할때 필요한거
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "c##scott"; //오라클 12버전 부터는 사용자 앞에c## 붙여야됨
		String password = "tiger";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
			
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("DB접속 성공");
			
			stmt = conn.createStatement();//데이터 전달 준비
			StringBuffer sql = new StringBuffer();
			String id = "testUser";
			sql.append("insert into MEMBER ");
			sql.append("values(MEMBER_SEQ.nextval, '" + id + "', '1234', '홍길동', sysdate)");
			
			System.out.println(sql.toString());
			
			int result = stmt.executeUpdate(sql.toString());
			
			System.out.println(result + " 행이 추가 되었습니다.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
