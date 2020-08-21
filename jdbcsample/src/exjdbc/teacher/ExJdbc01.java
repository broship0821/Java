package exjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExJdbc01 {
	public static void main(String[] args) {
		Connection conn = null;	//접속 객체
		Statement stmt = null;	//쿼리를 전송하고 결과를 반환하는 객체
		String url = "jdbc:oracle:thin:@192.168.157.132:1521:xe";
		String username = "scott";
		String password = "tiger";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//클래스를 찾아서 메모리에 로드~
			System.out.println("드라이버 로드 성공!");
			conn = DriverManager.getConnection(url, username, password);
			// ODB와 연결 con 연결된 객체
			System.out.println("DB접속 성공!!!");

			stmt = conn.createStatement();
			String id="tester";
			String pw="1234";
			StringBuffer sql = new StringBuffer();
		sql.append("insert into MEMBER ");
		sql.append("values (MEMBER_SEQ.nextval, '"+id+"', '"+pw+"', '홍길동', sysdate)");
			System.out.println(sql.toString());

			int result = stmt.executeUpdate(sql.toString());
			// 변경 된 행의 갯수 반환
			System.out.println(result + " 행이 추가되었습니다.");

		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}







