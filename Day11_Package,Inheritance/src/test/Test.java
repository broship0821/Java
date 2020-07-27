package test;
//패키지 이름은 소문자로 작성하는게 관례
//두 단어를 붙여야 할 경우에는 패키지를 2개 만들기
//최상위 패키지 이름은 java로 만들수 없음

//다른 패키지에 있는 객체들은 import 해와야됨
//import fruit.Apple;
//import fruit.Banana;
//import fruit.Melon;
import fruit.*; //fruit 패키지의 모든 클래스를 import 하겠다
import juice.*;

public class Test {

	public static void main(String[] args) {
		
		
		/*
		 다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는
		 반드시 패키지 경로를 표시해줘야됨
		 패키지명.클래스명 변수명 = new 패키지명.클래스명();
		 */
		fruit.Apple a = new fruit.Apple();
		juice.Apple a2 = new juice.Apple();
		Banana b = new Banana();
		Melon m = new Melon();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
