package part3.ex5.추상화;

public class PeterSchoolExam extends Exam {

	private int com;
	
	public PeterSchoolExam() {
		this(0,0,0,0);
	}
	
	public PeterSchoolExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}
	
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		//int total = getKor() + getEng() + getMath() + com;
		int total = onTotal() + com; // protected 함수사용해서 코드 간편화
		return total;
	}

	@Override
	public float avg() {
		float avg = total() / 4.0f;
		return avg;
	}
	
	
	
}
