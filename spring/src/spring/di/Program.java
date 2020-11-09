package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		/*
		Exam exam = new NewlecExam();
		Exam exam = new NewlecExam(10, 10, 10, 10);
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		
		이걸 xml로 구현해볼것임
		소스코드 수정 없이 부품을 바꿀수 있어야됨
		
		xml에서 객체도 만들고 setter도 구현했으니 그 xml
		파일에서 설정을 가져올 객체를 만들어야됨
		
		
		*/
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(NewlecDiConfig.class);
		
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
		ExamConsole console = (ExamConsole) context.getBean("console"); //id로 꺼내오면 무슨 형식인지 모르니 object로 꺼내옴, 형 변환 필요
//		ExamConsole console = context.getBean(ExamConsole.class); //ExamConsole 이 인터페이스와 같은 형식을 꺼내오라고 시킴, 형 변환 불필요, 근데 똑같은게 여러개일때는?
		console.print();
		
		System.out.println("------------------------------------------");
		
//		List<Exam> exams = new ArrayList<>(); //이걸 xml로 가져와보기
//		List<Exam> exams = (List<Exam>) context.getBean("exams");
//		exams.add(new NewlecExam(1,1,1,1)); 
		/*xml에선 setter나 생성자로만 값을 저장시킬 수 있음
		 생성자에 <list>태그로 값을 하나하나 넣을 수 있고
		 util 네임스페이스 이용해서 하나의 컬랙션을 다 넣을 수 있음
		*/
		
//		for(Exam e : exams)
//			System.out.println(e);

	}

}
