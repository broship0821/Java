package exjdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExJdbc03 {
	public static void main(String[] args){
		StringBuffer sql = new StringBuffer();
		sql.append("delete MEMBER ");
		sql.append("where id='hgd'");
		Connection con = null;
		Statement stmt = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			stmt = con.createStatement();
			
			//update문
			int result = stmt.executeUpdate(sql.toString());	
                                //sql문을 실행하고 갱신된 갯수를 result에 저장
			System.out.println(result + " 행이 삭제되었습니다.");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				if(con != null)	con.close();
				if(stmt != null) stmt.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
