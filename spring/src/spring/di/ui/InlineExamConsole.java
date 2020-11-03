package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	
	@Autowired(required = false)
	@Qualifier("exam2") //여기다 두면 기본 생성자로 넣는걸로 취급함
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("기본 생성자 생성");
	}
	
//	@Autowired
	public InlineExamConsole(/*@Qualifier("exam2")*/Exam exam) {
		System.out.println("오버로드 생성자 생성");
		this.exam = exam;
	}



	@Override
	public void print() {
		if(exam == null)
			System.out.printf("total is %d, avg is %f\n", 0, 0.0);
		else
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());

	}
	
//	@Autowired
//	@Qualifier("exam2") // xml에 id가 exam1인거에 매치해라
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter 생성");
		this.exam = exam;
		
	}

}
