package collection.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GenericIterator {

	public static void main(String[] args) {
		/*
		 지네릭스
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("1길동", 1, 1));
		list.add(new Student("2길동", 1, 2));
		list.add(new Student("3길동", 2, 1));
		
//		Iterator it = list.iterator();
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
//			Student s = (Student)it.next(); //지네릭스가 없으면 형 변환 해줘야됨
//			Student s = it.next();
			
//			System.out.println(s.name);
			System.out.println(it.next().name); //지네릭스 사용하면 이렇게 한줄로 사용할 수 있음
		}
		*/
		
		HashMap<String, Student> map = new HashMap<>();
		map.put("일길동", new Student("1길동", 1, 1, 100, 100, 100));
		
		Student s = map.get("일길동");
		
		System.out.println(map);
		System.out.println(s);
		
		
	}


}

class Student {
	String name = "";
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	
	
}
