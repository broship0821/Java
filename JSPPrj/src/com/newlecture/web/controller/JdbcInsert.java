package com.newlecture.web.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String username = "PETER";
		String password = "0821";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
			
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("DB접속 성공");
			
			stmt = conn.createStatement();
			
			
			for(int i=0; i<55;i++) {
				String sql = "insert into NOTICE values("+(i+10)+", '제목"+(i+1)+"' , 'peter', 'study hard bro', sysdate, "+(i)+", '"+(i+1)+"개 첨부파일')";
				System.out.println(sql);
				int result = stmt.executeUpdate(sql);
				
				System.out.println(result + " 행이 추가 되었습니다.");
				
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
