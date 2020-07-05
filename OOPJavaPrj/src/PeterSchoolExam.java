import part3.ex4.UI�ڵ�и��ϱ�.Exam;

public class PeterSchoolExam extends Exam{
	
	private int com;

	//������
	public PeterSchoolExam() {

		this(0,0,0,0);
	}
	//�����ε� ������
	public PeterSchoolExam(int kor, int eng, int math, int com) {
		
		//this.kor = kor; �θ� Ŭ�������� ������ �ٸ� ĸ���̱� ������ ������ ��ü�� ����� ���� ����
		//this.setKor(kor); �̷� ������� �ؾߵ�
		//�ٵ� Exam�� �����ε� �����ڰ� ������ �װ� ������ ������ ����
		super(kor, eng, math); // ���� �ȿ� �ִ°� �ڽ� Ŭ���� �����ڿ��� �Ű� ������ �޴� ����, Exam ������ �ٷ� ��밡��
		
		this.com = com;

	}
	
	
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	//ctrl + space ������ ��� ���� �� �ִ� �޼ҵ�� ��������
	@Override
	public int total() {
		
		return super.total() + com; //super. �� �θ� Ŭ������ ������
	}
	
	@Override
	public float avg() {
		
		return total() / 4.0f;
	}
}
