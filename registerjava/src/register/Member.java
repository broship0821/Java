package register;

public class Member {

	private int number;
	private String id;
	private String pw;
	private String name;

	public Member() {
		// TODO Auto-generated constructor stub
	}
	public Member(int number, String id, String pw, String name){
		this.number = number;
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Member = [number=" + number +
				",id=" + id +
				",pw=" + pw +
				",name=" + name + "]";
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
	
	
}
