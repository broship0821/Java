package collection.set;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ": " + age;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		Person p = (Person)obj;
		
		return this.name.equals(p.name) && this.age == p.age;
	}
	
		
	
}

public class HashSetPractice {

	public static void main(String[] args) {
		
		//HashSet: 중복 X 순서 X
		
		
		Object[] objArr = {"1", 1, "2", "2", "3", "3", "4", "4", "4"};
		Set set = new HashSet();
		
		for(int i=0;i<objArr.length;i++) {
			System.out.println("성공여부: " + objArr[i] + ": " + set.add(objArr[i]));
		}
		
		//HashSet에 저장된 요소들 출력
		System.out.println(set);
		//중복된 값은 false로 저장 안되고 1이랑 "1"은 다르니 저장 됨
		
		//Iterator 이용해서 저장된 요소들 출력
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("----------------------");
		
		Set set2 = new HashSet();
		
		//set의 크키가 6보다 작은 동안 1~45 사이의 난수를 저장
		for(int i=0;set2.size()<6;i++) {
			int num = (int) (Math.random()*45) + 1;
			set2.add(num);
		}
		//중복 안되니까 무조건 6개 다른 값이 들어옴
		System.out.println("정렬 전" + set2);
		//set은 정렬 안됨, list로 바꾼 후 정렬해줘야됨
		List list = new LinkedList(set2); //생성자를 이용해서 list로 전환
		Collections.sort(list); //list로 바꾼 후 정렬
		System.out.println("정렬 후" + list);
		
		System.out.println("----------------------");
		
		
		/*
		 중복을 걸러내는 과정:
		 HashSet은 객체를 저장하기 전에 기존에 같은 객체가 있는지 확인
		 add(Object o) 사용시 저장할 객체의 equals()와 hashCode() 호출
		 
		 결론: 내가 만든 객체를 set을 활용하려면 equals()와 hashCode()를 오버라이딩해야됨
		 */
		
		HashSet set3 = new HashSet();
		
		set3.add("abc");
		set3.add("abc"); //String은 중복이라 저장 안됨
		set3.add(new Person("David", 10));
		set3.add(new Person("David", 10)); //Person 객체에는 equals()와 hashCode()가 없어서 중복 확인을 못함
		//내가 만든 객체를 set으로 사용하려면 equals()와 hashCode()를 오버라이딩해야됨
		
		System.out.println(set3);
		
		System.out.println("----------------------");
		
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A = " + setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B = " + setB);
		
		
		//교집합
		it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp))
				setKyo.add(tmp);
		}
		System.out.println("A ∩ B = " + setKyo);
		
		//차집합
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!(setB.contains(tmp)))
				setCha.add(tmp);
		}
		System.out.println("A - B = " + setCha);
		
		//합집합
		for(Object tmp : setA) {
			setHab.add(tmp);
		}
		for(Object tmp : setB) {
			setHab.add(tmp);
		}
		System.out.println("A ∪ B = " + setHab);
		
		//교집합 메서드 .retainAll()
//		setA.retainAll(setB); //공통된 요소 남기고 삭제
//		System.out.println(setA);
		
		//합집합 메서드 .addAll()
//		setA.addAll(setB);
//		System.out.println(setA);
		
		//차집합 메서드 .removeAll()
//		setA.removeAll(setB);
//		System.out.println(setA);
		
	}

}
