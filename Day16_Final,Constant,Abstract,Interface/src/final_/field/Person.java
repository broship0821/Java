package final_.field;

public class Person {

	//final 변수는 값 변경이 불가능함
	
	final String nation = "대한민국";
	//final은 마지막 변수이기 때문에(변경 불가) 초기화를 꼭 시켜줘야됨
	final String name; //생성자를 사용해서 초기화도 가능
	int age;
	
	public Person(String name) {
		this.name = name;
	}
	
	
	
}
