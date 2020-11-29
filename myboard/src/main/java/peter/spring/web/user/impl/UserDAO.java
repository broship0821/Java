package peter.spring.web.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import peter.spring.web.common.JDBCUtil;
import peter.spring.web.user.UserVo;
@Repository("userDAO")
public class UserDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private final String USER_GET = "SELECT * FROM myuser WHERE id=? and password=?";
	
	public UserVo getUser(UserVo vo) {
		UserVo user = null;
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USER_GET);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new UserVo(rs.getString("id"), rs.getString("password"), rs.getString("name"), rs.getString("role"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return user;
		
	}
	
}
