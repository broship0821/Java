package exjdbc.home;

import java.sql.Date;

public class Member {
	private int num;
	private String id;
	private String pw;
	private String name;
	private Date regdate;
	
	public Member() {}
	public Member(int num, String id, String pw, String name, Date regdate) {
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		return "Member = [NUM: " + num + 
				", ID: " + id +
				", PW: " + pw +
				", NAME: " + name +
				", DATE: " + regdate + "]";
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
}
