package exjdbc.home;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyJdbc01 {

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
			
			//insert
//			String userid = "peter";
//			String passwd = "0821";
//			sql.append("insert into MEMBER ");
//			sql.append("values(MEMBER_SEQ.nextval, '" + userid + "', '" + passwd + "', '전형배', sysdate)");
			
			//update
//			sql.append("update MEMBER set NAME='jeon' where ID='peter'");
			
			//delete
//			sql.append("delete from MEMBER where NAME='jeon'");
							
			
//			System.out.println(sql.toString());
//			
//			int result = stmt.executeUpdate(sql.toString());
//			
//			System.out.println(result + " 행이 추가 되었습니다.");
			
			//select
			sql.append("select * from MEMBER");
			ResultSet rs = stmt.executeQuery(sql.toString());
			
			while(rs.next()) {
				int num = rs.getInt("NUM");
				String id = rs.getString("ID");
				int pw = rs.getInt("PW"); //DB에서 문자열이여도 여기서는 바로 int에 집어넣을 수 있음
				String name = rs.getString(4); //인덱스 위치로 찾기 가능, 1부터 시작
				Date regdate = rs.getDate(5);
				
				System.out.println("NUM: " + num);
				System.out.println("ID: " + id);
				System.out.println("PW: " + pw);
				System.out.println("NAME: " + name);
				System.out.println("DATE: " + regdate);
				System.out.println("-----------------------");
			}
			
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
