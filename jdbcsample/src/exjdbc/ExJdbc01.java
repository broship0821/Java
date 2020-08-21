package exjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExJdbc01 {

	public static void main(String[] args) {
		
		Connection conn = null; //접속객체
		
		Statement stmt = null; //쿼리를 전송하고 결과를 반환하는 객체
		
		String url = "jdbc:oracle:thin:@192.168.6.128:1521:xe";
		String username = "scott";
		String password = "tiger";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//클래스를 찾아서 메모리에 로드
			System.out.println("드라이버 로드 성공~");
			//여기까지 성공하면 db사용 준비 완료
			conn = DriverManager.getConnection(url, username, password); //DB와 연결 시도(로그인)
			//ODB와 연결 con 연결된 객체
			System.out.println("DB접속 성공"); //접속 성공
			
			stmt = conn.createStatement(); //접속 후 데이터 전달 준비
			//여기서 바로 String써도 되나 String은 메모리 효율이 떨어짐, 효율 증가를 위해 StringBuffer 사용
			//전달한 쿼리
			String id = "testUser";
			StringBuffer sql = new StringBuffer();
//			sql.append("insert into MEMBER ");
//			sql.append("values(MEMBER_SEQ.nextval, '" + id + "', '1234', '홍길동', sysdate)");
			
			sql.append("commit");
			System.out.println(sql.toString());
			
			int result = stmt.executeUpdate(sql.toString()); //엔터의 역활(전송한 쿼리 실행)
			//executeUpdate: insert, update, delete, create, drop 수행 시 사용 -> 변경된 횟수를 반환
			//executeQuery: select 수행 시 사용 -> DB결과를 반환
			
			//변경 된 행의 갯수 반환
			System.out.println(result + " 행이 추가 되었습니다.");
			
//			ResultSet set = executeQuery(); //executeQuery 함 사용해보자
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
