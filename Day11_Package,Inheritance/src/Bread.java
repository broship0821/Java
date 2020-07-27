
public class Bread {

	int price;
	String name;
	String ingredient;
	
	//데이터 - 생성자 - 메서드 이 순서로 작성하는게 관례
	Bread(int price, String name, String ingredient){
		this.price = price;
		this.name = name;
		this.ingredient = ingredient;
		info();
	}
	//위에꺼는 오버로딩 생성자, 오버로딩 생성자를 하나라도 만들었으면 JVM에서 자동으로 생성자 안만들어줌
	//생성자 따로 작성해줘야됨, 기본 생성자는 하나 만들어 주는것이 좋음
	Bread(){
		
	}
	
	void info() {
		System.out.println("빵 이름: " + name);
		System.out.println("빵 가격: " + price);
		System.out.println("주재료: " + ingredient);
	}
	
	
}
