package exjdbc.home;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyJdbcPstmt {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ConnectionUtil jdbcTemplate = ConnectionUtil.getInstance();
		
		StringBuffer sql = new StringBuffer();
		//SUBJECT 테이블 생성
//		sql.append("create table SUBJECT (");
//		sql.append("NUM number primary key,");
//		sql.append("MEM_NUM number,");
//		sql.append("SUB_NUME varchar2(20),");
//		sql.append("SUB_SCORE number(5,2)");
//		sql.append(")");
//		System.out.println(sql.toString());
		//SUBJECT외래키 설정
//		sql.append("alter table SUBJECT add constraint SUBJECT_FK ");
//		sql.append("foreign key(MEM_NUM) references MEMBER (NUM)");
//		System.out.println(sql.toString());
		//SUBJECT 시퀀스 생성
//		sql.append("create sequence SUBJECT_SEQ ");
//		sql.append("start with 1 ");
//		sql.append("increment by 1 ");
//		sql.append("maxvalue 99999 ");
//		sql.append("nocache ");
//		sql.append("nocycle ");
//		sql.append("noorder");
//		System.out.println(sql.toString());
		
		//MEMBER 테이블 조회
//		sql.append("select * from MEMBER");
		
		//SUBJECT 테이블에 데이터 삽입
//		sql.append("insert into SUBJECT ");
//		sql.append("values (SUBJECT_SEQ.nextval, ?, ?, ?)");
		
		//SUBJECT 테이블 조회
		sql.append("select m.NAME, m.NUM, s.SUB_NAME, s.SUB_SCORE ");
		sql.append("from MEMBER m, SUBJECT s ");
		sql.append("where m.NUM = s.MEM_NUM");
		System.out.println(sql.toString());
		
		try {
			conn = jdbcTemplate.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			
//			int n = pstmt.executeUpdate();
//			System.out.println(n + "개 sql문 실행 성공");
			
//			rs = pstmt.executeQuery();
//			//MEMBER 테이블 조회
//			while(rs.next()) {
//				System.out.print(rs.getString(1) + "  \t");
//				System.out.print(rs.getString(2) + "  \t");
//				System.out.print(rs.getString(3) + "  \t");
//				System.out.print(rs.getString(4) + "  \t");
//				System.out.print(rs.getString(5) + "  \t");
//				System.out.println();
//			}
			
			//SUBJECT 데이터 삽입
//			pstmt.setInt(1, 1);
//			pstmt.setString(2, "jsp");
//			pstmt.setDouble(3, 78.9);
//			pstmt.executeUpdate();
//			System.out.println("성공!");
			
			rs = pstmt.executeQuery();
			//SUBJECT 테이블 조회
			while(rs.next()) {
				System.out.print(rs.getString(1) + "  \t");
				System.out.print(rs.getInt(2) + "  \t");
				System.out.print(rs.getString(3) + "  \t");
				System.out.print(rs.getDouble(4) + "  \t");
				System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcTemplate.closeConnection(rs);
			jdbcTemplate.closeConnection(pstmt);
			jdbcTemplate.closeConnection(conn);
		}

	}

}
