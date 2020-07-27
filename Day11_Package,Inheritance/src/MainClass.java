/*
 객체를 생성하지 않았을 때의 예시를 보고
 빵 객체를 생성할수 있는 클래스를 작성해 보시오
 클래스 이름은 Bread로 통일
 
 MainClass에서 똑같이 피자빵, 초코케이크의 정보를 호출하기
 생성자는 자유
 */

public class MainClass {

	public static void main(String[] args) {

		//기본 생성자로 하는 방법
		Bread pizza = new Bread();
		pizza.name = "피자빵";
		pizza.price = 500;
		pizza.ingredient = "밀가루";
		pizza.info();
		
		System.out.println("--------------");
		//오버로딩 생성자로 하는 방법
		Bread choco = new Bread(1500, "초코케이크", "초콜렛");
		

	}

}
