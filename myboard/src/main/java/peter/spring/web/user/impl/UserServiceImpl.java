package peter.spring.web.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import peter.spring.web.user.UserService;
import peter.spring.web.user.UserVo;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	@Override
	public UserVo getUser(UserVo vo) {
		return userDAO.getUser(vo);
	}
}
