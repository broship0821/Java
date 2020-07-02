package part3.ex4.UI코드분리하기;

public class Exam {
	int kor;
	int eng;
	int math;
	
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
	public int total() {
		
		return kor + eng + math;
	}
	public float avg() {
		
		return total() / 3.0f;
	}
}
