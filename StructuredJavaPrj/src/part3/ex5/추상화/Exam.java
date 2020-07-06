package part3.ex5.�߻�ȭ;

public abstract class Exam {
	//abstract�� ���ָ� �ش� Ŭ������ �߻�ȭ��, new Exam(); �Ұ����ϰ� �ڽ� Ŭ������ ���� ����
	private int kor;
	private int eng;
	private int math;
	
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
	
	// �߻� �޼ҵ� ����
	//�ؿ� �Լ����� �ٸ� ���� Ŭ�������� ����Ҷ����� �ٲ�� ������ ������ �ǹ̰� ����, �߻� �޼ҵ�� �������ߵ�
	//abstract �ϸ� �ڽ� Ŭ������ �ݵ�� �ش� �Լ��� ���� �����ؾߵ�, ���ϸ� �����߻�
	public abstract int total(); //�̷��� �ڽ� Ŭ������ ��� kor+eng+math �ߺ��ǰ� ����ؾߵ�
	//protected �Լ��� �ٸ� Ŭ�������Դ� �Ⱥ��� �ְ� �ڽ� Ŭ�������Ը� ������
	protected int onTotal() {
		return kor+eng+math;
	}
	//�̷��� �ڽ� Ŭ������ onTotal()�Ἥ �ڵ带 ����ȭ�Ҽ� ����
	public abstract float avg();
}
