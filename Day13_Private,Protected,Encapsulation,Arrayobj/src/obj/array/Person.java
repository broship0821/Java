package obj.array;

public class Person {

	private String name;
	private int age;
	private String gender;
	
	
	
	
	public Person(String name, int age, String gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	void personInfo() {
		System.out.printf("이름: %s\n", name);
		System.out.printf("나이: %d\n", age);
		System.out.printf("성별: %s\n", gender);
	}
	
	
	
}
