import part3.ex4.UI코드분리하기.Exam;

public class Program {

	public static void main(String[] args) {
		
		//Exam exam = new Exam(1,1,1); 이건 예전꺼고 이제 새로운것이 필요함
		PeterSchoolExam exam = new PeterSchoolExam();
		
		exam.setKor(10);
		exam.setEng(10);
		exam.setMath(10);
		exam.setCom(10); // 이러면 total이 40이 나와야 되는데 틀로만 쓰니까 위 3과목만 총점 계산되어서 나옴
		System.out.println(exam.total());

	}

}
