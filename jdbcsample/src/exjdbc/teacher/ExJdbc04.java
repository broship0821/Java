package exjdbc;
import java.sql.*;

public class ExJdbc04 {
	public static void main(String[] args){
		StringBuffer sql = new StringBuffer();
		sql.append("select NUM, ID, PW, NAME, REGDATE ");
		sql.append("from MEMBER");
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.157.132:1521:xe", "scott", "tiger");
			stmt = con.createStatement();

			rs = stmt.executeQuery(sql.toString()); 
                            //쿼리가 select일 때는 excuteUpdate()를 사용한다.
			while(rs.next()){
				int number = rs.getInt(1);
				String id = rs.getString(2);
				int pw = rs.getInt("PW");
				String name = rs.getString("NAME");
				Date regdate = rs.getDate("REGDATE");
				System.out.println(number+"\t"+id+"\t"+pw+"\t"+name+"\t"+regdate);
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
				if(con != null)	con.close();
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}		
	}
}

