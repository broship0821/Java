import part3.ex4.UI�ڵ�и��ϱ�.Exam;

public class Program {

	public static void main(String[] args) {
		
		//Exam exam = new Exam(1,1,1); �̰� �������� ���� ���ο���� �ʿ���
		//PeterSchoolExam exam = new PeterSchoolExam();
		//�׸��� ���� �̷��� ����غ��� ����
		PeterSchoolExam exam = new PeterSchoolExam(10,10,10,10);
		//���� �ؿ�ó�� ���ϰ� ������ �Ű������� ����ؼ� �ٷ� ��� ����
		//exam.setKor(10);
		//exam.setEng(10);
		//exam.setMath(10);
		//exam.setCom(10); // �̷��� total�� 40�� ���;� �Ǵµ� Ʋ�θ� ���ϱ� �� 3���� ���� ���Ǿ ����
		System.out.println(exam.total());
		System.out.println(exam.avg());

	}

}
