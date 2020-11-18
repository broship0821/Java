package user;

public class User {
	private String userID;
	private String userPW;
	private String userName;
	private String userGender;
	private String userEmail;
	
	public User() {
	}

	public User(String userID, String userPW, String userName, String userGender, String userEmail) {
		this.userID = userID;
		this.userPW = userPW;
		this.userName = userName;
		this.userGender = userGender;
		this.userEmail = userEmail;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	
	
}
