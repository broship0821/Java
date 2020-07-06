package part3.ex5.추상화;

public abstract class Exam {
	//abstract만 써주면 해당 클래스는 추상화됨, new Exam(); 불가능하고 자식 클래스만 생성 가능
	private int kor;
	private int eng;
	private int math;
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//이게 오버로드 생성자임, 오버로드 생정자를 생성한 순간 컴파일러가 자동으로 생성자를 만들어 주지 않으니 하나 더 만들어야됨
	public Exam() {
		//this.kor = 0;
		//this.eng = 0;
		//this.math = 0;
		//보통은 이렇게 하는게 맞지만 생성자는 이렇게 해야됨
		this(0,0,0);
	}
	//이렇게하면 setters를 사용하지 않아도 됨
	
	
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// 추상 메소드 구현
	//밑에 함수들은 다른 하위 클래스들이 사용할때마다 바뀌기 때문에 구현의 의미가 없음, 추상 메소드로 만들어줘야됨
	//abstract 하면 자식 클래스는 반드시 해당 함수를 따로 구현해야됨, 안하면 오류발생
	public abstract int total(); //이러면 자식 클래스에 계속 kor+eng+math 중복되게 사용해야됨
	//protected 함수는 다른 클래스에게는 안보여 주고 자식 클래스에게만 보여줌
	protected int onTotal() {
		return kor+eng+math;
	}
	//이러면 자식 클래스는 onTotal()써서 코드를 간편화할수 있음
	public abstract float avg();
}
