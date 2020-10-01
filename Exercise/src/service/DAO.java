package service;

public class DAO {
	private static DAO instance = null;
	private DAO() {}
	public static DAO getInstance() {
		if(instance==null) {
			synchronized (DAO.class) {
				instance = new DAO();
			}
		}
		return instance;
	}
}
