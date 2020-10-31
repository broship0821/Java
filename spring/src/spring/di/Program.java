package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
//		ExamConsole console = (ExamConsole) context.getBean("console"); //id로 꺼내오면 무슨 형식인지 모르니 object로 꺼내옴, 형 변환 필요
		ExamConsole console = context.getBean(ExamConsole.class); //ExamConsole 이 인터페이스와 같은 형식을 꺼내오라고 시킴, 형 변환 불필요, 근데 똑같은게 여러개일때는?
		console.print();
		

	}

}
