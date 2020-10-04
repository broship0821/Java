package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//ArrayList list2 = new ArrayList(list1.subList(1, 4)); //1~4인덱스 가져와서 따로 리스트 만들기
		List sub = list1.subList(1, 4); //sub 는 읽기만 가능
		ArrayList list2 = new ArrayList(sub); //sub와 같은 내용의 ArrayList생성
		
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println("sub: " + sub);
		System.out.println();
		
		//conllection은 인터페이스, collections는 유틸 클래스
		//collection 정렬하기
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
		
		//list2가 전부 list1에 포함되어 있는가
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));
		
		//중간 인덱스에 add하기
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); //그 뒤에 요소들이 한칸씩 옮겨야 하기 때문에 부담가는 작업임
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
		
		//변경, 치환
		list2.set(3, "AAAAA");
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
		
		//위치 찾기: indexOf()
		list1.add(0, "1");
		System.out.println("String 1위치= " + list1.indexOf("1"));
		System.out.println("Integer 1위치= " + list1.indexOf(1));
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
		
		//삭제: remove(인덱스 혹은 값 입력) -> 숫자 입력하면 인덱스, new로 해서 하면 값
		list1.remove(5); //인덱스로 지우기
		list1.remove(new Integer(1)); //값을 찾아서 지우기
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
		
		//겹치는 부분만 남기고 나머지는 삭제(교집합 구하기)
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
		
		//list2에서 list1에 포함된 객체들을 삭제
		for(int i=list2.size()-1;i>=0;i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}

}
