package exjdbc.home;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Main {
	
	static void printAll(MemberDao dao) {
		// 전체목록보기
		System.out.println("---------------");
		List<Member> ret = dao.selectAll();
		for (Member tmp : ret) {
			System.out.println(tmp);
		}
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ConnectionUtil jdbcTemplate = ConnectionUtil.getInstance();
		
		StringBuffer sql = new StringBuffer();
		sql.append("select * from MEMBER");
		
		try {
			conn = jdbcTemplate.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			
			MemberDao dao = new MemberDao();
			
			while(rs.next()) {
				Member m = new Member();
				m.setNum(rs.getInt("NUM"));
				m.setId(rs.getString("ID"));
				m.setPw(rs.getString("PW"));
				m.setName(rs.getString("NAME"));
				m.setRegdate(rs.getDate(5));
				
				dao.insertMember(m);
			}
			printAll(dao);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
