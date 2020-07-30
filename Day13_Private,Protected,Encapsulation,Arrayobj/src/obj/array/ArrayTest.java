package obj.array;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
//		Person kim = new Person("김철수", 32, "남자");
//		Person lee = new Person("이영희", 25, "여자");
//		Person hong = new Person("홍길동", 50, "남자");
//
//		kim.personInfo();
//		lee.personInfo();
//		hong.personInfo();
		
//		Person[] people = new Person[3];		
//		people[0] = kim;
//		people[1] = lee;
//		people[2] = hong;
		
		Person[] people = {
				new Person("김철수", 32, "남자"),
				new Person("이영희", 25, "여자"),
				new Person("홍길동", 50, "남자")
		};
		//배열 객체는 2번 생성해야됨
		
		System.out.println(Arrays.toString(people));
		//객체는 heap영역의 배열 영역에 바로 들어가는게 아니라
		//heap영역에 다른 장소에 생성이 된 후 그 주소값이 배열 영역에 들어가게됨

		System.out.println("---------------------------");
		
		for(int i=0;i<people.length;i++) {
			people[i].personInfo();
		}
		
		System.out.println("---------------------------");
		
		
		for(Person p : people) {
			p.personInfo();
		}
		
		
		
		
		
		
		
		
		
	}

}
