package api.lang.obj;

public class Person {
	
	String name;
	int age;
	String gender;
	
			
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "이름: " + name + "\n나이: " + age + "\n성별: " + gender + "\n--------------------";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) { //일단 들어온 객체가 Person 타입인지 확인
			
			Person p = (Person) obj; //Object를 Person 객체로 바꿔줌
			
			if(this.age==p.age) {
				return true;
			}
			
		}
		return false;
	}



	void personInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("성별: " + gender);
		System.out.println("--------------------");
	}
	
}
