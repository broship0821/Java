package part3.ex5.�߻�ȭ;

public class PeterSchoolExamConsole extends ExamConsole{

	@Override
	protected Exam makeExam() {
		
		return new PeterSchoolExam();
	}

	
}
