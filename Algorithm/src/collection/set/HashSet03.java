package collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class HashSet03 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		//위에 같이 기본 자료형은 중복 저장 안됨
		//밑에 내가 만든 클래스들은 equals랑 hashCode를
		//오버라이딩 해야지 중복 저장 안됨
		set.add(new Person("Peter", 20));
		set.add(new Person("Peter", 20));
		
		System.out.println(set);
		

	}

}

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}

	//바로 오버라이딩 한거 써도 되지만 최신에는 이렇게 사용
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		Person p = (Person)obj;
		
		return this.name.equals(p.name) && this.age==p.age;
	}
	
	
}
