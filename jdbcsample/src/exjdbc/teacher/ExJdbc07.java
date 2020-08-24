package exjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExJdbc07 {
	public static void main(String[] args){
		StringBuffer sql1 = new StringBuffer();
		sql1.append("insert into MEMBER values (MEMBER_SEQ.nextval, ?, ?, ?, ?) ");	
		StringBuffer sql2 = new StringBuffer();
		sql2.append("update MEMBER set PW = ? where ID = ? and PW = ?");
		Connection con = null;
		PreparedStatement pstmt = null;
		try{
			String id = "tester11";	//이 값을 변경하면서 테스트, 유저 만들고 그 유저 수정
			//트랜잭션 1번 작업 시작 insert
			con = ConnectionUtil.getInstance().getConnection();
			con.setAutoCommit(false);	//자동커밋 해제
			System.out.println("1번 작업 시작!");
			pstmt = con.prepareStatement(sql1.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, "1234");
			pstmt.setString(3, "ttt");
			pstmt.setDate(4, new java.sql.Date(System.currentTimeMillis()));
			pstmt.executeUpdate();
			System.out.println("1번 작업 성공!");
			//1번 작업 종료 -> 2번 작업 시작 update
			System.out.println("2번 작업 시작!");
			pstmt.close();
			pstmt = con.prepareStatement(sql2.toString());
//			pstmt.setString(1, "4321");
			pstmt.setString(1, "");	//비번 제약조건을 not null로 바꾸고, 비밀번호는 NULL일 수 없으므로 문제 발생
			pstmt.setString(2, id);
			pstmt.setString(3, "1234");	//기존 비밀번호
			pstmt.executeUpdate();
			System.out.println("2번 작업 성공!");
			//2번 작업 종료, 정상적으로 실행된 경우 DB에 반영한다.
			con.commit();
			System.out.println("DB 커밋 완료!");
		}
		catch(SQLException e){
			try{
				con.rollback();
				System.out.println("DB 작업 실패!");
			}
			catch(SQLException e1){	
				e1.printStackTrace();
			}
		}
		finally{
			ConnectionUtil.getInstance().closeConnection(pstmt);
			ConnectionUtil.getInstance().closeConnection(con);
		}
	}
}
