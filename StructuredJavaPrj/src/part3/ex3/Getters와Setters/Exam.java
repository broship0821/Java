package part3.ex3.Getters와Setters;

public class Exam {
	int kor;
	int eng;
	int math;
	
	public Exam() {
		this(0, 0, 0);
	}
	
//	오버로드 생성자
public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//	마우스 우클릭, Source에 getters,setters 세팅하는 방법이 있음
//	자동으로 getters setters 생성해줌
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
		return kor+eng+math;
	}
	public float avg() {
		return total() / 3.0f;
	}
	
	
//  ExamList 파일에서 하나 하나 지정하는 방법
//	public int getKor() {
//		return kor;
//	}
//	public int getEng() {
//		return eng;
//	}
//	public int getMath() {
//		return math;
//	}
//	public void setKor(int kor) {
//		this.kor = kor;
//	}
//	public void setEng(int eng) {
//		this.eng = eng;
//	}
//	public void setMath(int math) {
//		this.math = math;
//	}
}
