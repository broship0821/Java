import part3.ex4.UI코드분리하기.Exam;

public class PeterSchoolExam extends Exam{
	
	private int com;

	//생성자
	public PeterSchoolExam() {

		this(0,0,0,0);
	}
	//오버로드 생성자
	public PeterSchoolExam(int kor, int eng, int math, int com) {
		
		//this.kor = kor; 부모 클래스여도 엄연히 다른 캡슐이기 때문에 데이터 자체를 사용할 수는 없음
		//this.setKor(kor); 이런 방식으로 해야됨
		//근데 Exam에 오버로드 생성자가 있으면 그걸 가져다 쓸수도 있음
		super(kor, eng, math); // 가로 안에 있는건 자식 클래스 생성자에서 매개 변수로 받는 값임, Exam 생성자 바로 사용가능
		
		this.com = com;

	}
	
	
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	//ctrl + space 누르면 상속 받을 수 있는 메소드들 나와있음
	@Override
	public int total() {
		
		return super.total() + com; //super. 은 부모 클래스꺼 가져옴
	}
	
	@Override
	public float avg() {
		
		return total() / 4.0f;
	}
}
