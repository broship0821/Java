package part3.ex4.UI�ڵ�и��ϱ�;

public class Exam {
	int kor;
	int eng;
	int math;
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//�̰� �����ε� ��������, �����ε� �����ڸ� ������ ���� �����Ϸ��� �ڵ����� �����ڸ� ����� ���� ������ �ϳ� �� �����ߵ�
	public Exam() {
		//this.kor = 0;
		//this.eng = 0;
		//this.math = 0;
		//������ �̷��� �ϴ°� ������ �����ڴ� �̷��� �ؾߵ�
		this(0,0,0);
	}
	//�̷����ϸ� setters�� ������� �ʾƵ� ��
	
	
	
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
