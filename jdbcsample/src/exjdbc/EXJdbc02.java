package exjdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EXJdbc02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@192.168.6.128:1521:xe";
		String username = "scott";
		String passwd = "tiger";
		
		StringBuffer sql = new StringBuffer();
		sql.append("insert into MEMBER values(MEMBER_SEQ.nextval, 'peter', '0821', '전형배', sysdate)");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
