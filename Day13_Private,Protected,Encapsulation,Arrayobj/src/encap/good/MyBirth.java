package encap.good;

public class MyBirth {

	/*
	 은닉(캡슐화): 데이터 보호의 목적으로 사용하는
	 OOP 기술 중 하나,
	 
	 은닉할 멤버변수에 private 접근 제한을 붙임,
	 
	 */
	
	private int year;
	private int month;
	private int day;
	
	void birthInfo() {
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n", this.year, this.month, this.day);
	}
	
	/*
	 은닉은 데이터에 접근 제한을 걸어서 정보를 보호하는 것이 목적이지만,
	 private을 설정하면 데이터 접근 자체가 불가능해짐
	 
	 따라서 데이터의 유효성을 검증할 수 있는 제어문을 사요하여
	 데이터의 접근을 허용하도록 설계하는데, 이때 사용하는 메서드를 
	 setter / getter 메서드라고 부름
	 
	 # setter method
	 	1. setter는 은닉된 변수에 값을 저장하기 위한 메서드 입니다.
	 	
	 	2. 메서드내부에 데이터 유효성 검증 로직을 작성하여
	 	적절한 데이터만 멤버 변수에 저장시키고, 접근 제한자는
	 	public으로 설정하여 외부에서 사용할 수 있게 함.
	 	
	 	3. 메서드 이름은 일반적으로 set + 멤버변수이름으로 지정함
	 */
	
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			System.out.println("잘못된 일자 입력입니다.");
		}
		else {
			this.day = day;			
		}
	}
	
	/*
	 getter method
	 
	 	1.getter는 은닉된 변수의 값을 참조할 때 사용하는 메서드
	 	2. setter와 마찬가지로 public 제한을 통해 외부에 메서드를 공개하고,
	 	이름은 일반적으로 get + 멤버변수이름으로 지정함
	 */
	
	public int getDay(String passwd) {
		if(passwd.equals("qwe123")) {
			return this.day;	
		}
		else {
			System.out.println("비밀번호가 틀렸습니다");
			return 0;
		}
	}
	
	/*
	 - month와 year의 setter/getter 메서드 선언하기
	 - month: 1~12
	 - year: 1900~2100
	 - getter메서드는 따로 비밀번호 등 권한 검사 없이 바로 return하기
	 */
	
	public void setMonth(int month) {
		if(month>=1 && month<=12) {
			this.month = month;
		}
		else {
			System.out.println("잘못된 월 입력입니다.");
		}
	}
	public int getMonth() {
		return this.month;
	}
	
	public void setYear(int year) {
		if(year>=1900 && year<=2100) {
			this.year = year;
		}
		else {
			System.out.println("잘못된 년도 입력입니다.");
		}
	}
	public int getYear() {
		return year;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
