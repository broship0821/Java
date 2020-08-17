package collection.list;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		//기본 길이가 10인 ArrayList 생성
		ArrayList list1 = new ArrayList(10);
		//arraylist에는 객체만 저장 가능, 그냥 숫자 써도 객체로 바꿔줌(오토박싱)
		list1.add(new Integer(5));	
		list1.add(4);	
		list1.add(2);	
		list1.add(0);	
		list1.add(1);	
		list1.add(3);	

		ArrayList list2 = new ArrayList(list1.subList(1, 4)); //list1의 1~3위치 가져오기
		
		System.out.println(list1);
		System.out.println(list2);
		
	}

}
