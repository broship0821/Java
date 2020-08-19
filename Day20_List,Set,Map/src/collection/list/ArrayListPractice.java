package collection.list;

import java.util.ArrayList;
import java.util.Collections;

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
		list1.add("문자열"); //리스트에는 여러 데이터 형식 삽입 가능	
		list1.add(new Integer(5));	
		list1.add(4);	
		list1.add(2);	
		list1.add(0);	
		list1.add(1);	
		list1.add(3);	
		list1.add("문자열");
		System.out.println(list1.get(11));
		//ArrayList 와 일반 배열과 다르게 크기를 넘어서도 알아서 키워줌

		ArrayList list2 = new ArrayList(list1.subList(1, 4)); //list1의 1~3위치 가져오기
		
		System.out.println(list1);
		System.out.println(list2);
		
//		//Collection은 인터페이스, Collections는 유틸 클래스
//		Collections.sort(list1); //리스트 정렬하기, 안에 내용이 전부 숫자여야됨
//		Collections.sort(list2);
//		System.out.println(list1);
//		System.out.println(list2);
//		
//		//list1은 list2의 모든 요소를 포함하고 있는가?
//		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));
//		
//		list2.add("B");
//		list2.add("C");
//		list2.add(3, "A"); //3번째 인덱스에 A 대입
//		System.out.println(list1);
//		System.out.println(list2);
//		
//		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));
//		
//		list2.set(3, "AA"); //3번째 인덱스 "AA"로 변경
//		System.out.println(list1);
//		System.out.println(list2);
//		
//		//찾고싶은 데이터의 인덱스 위치 찾기: indexof
//		System.out.println("index위치: " + list2.indexOf("AA"));
//		
//		//해당 인덱스 지우기
//		list2.remove(4); //숫자를 적으면 해당 인덱스에 있는 데이터 사라짐
//		list2.remove("AA"); //문자열 적으면 해당 문자열 사라짐
//		list2.remove(new Integer(4)); //해당 숫자를 찾아서 지우고 싶으면 이렇게 사용해야됨
//		
//		System.out.println(list1);
//		System.out.println(list2);
//		
//		//두 리스트의 교집합 구하기
//		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2)); //교집합 구하고 나머지 삭제됨
//		System.out.println(list1);
//		System.out.println(list2);
//
//		//교집합 부분 지우기
////		for(int i=0;i<list2.size();i++) {
////			if(list1.contains(list2.get(i))) {
////				list2.remove(i);
////			}
////		} //왜 i++로하면 안되는거지????????
//		/*
//		 remove() 의 알고리즘은 해당 인덱스 위치 바로 뒤 인덱스를 하나씩 앞으로 땡기고(배열 복사 발생)
//		 맨 마지막 인덱스에 null값을 지정하고 size값을 하나 감소시킴
//		 그래서 앞에서부터 지우면 0번 위치 지우고 0번째 위치에 아직 값이 남아있는데 1번 지움
//		 그래서 값이 남아있을 수 있음
//		 그래서 지울땐 뒤에서 부터 지우는게 맞음(배열 복사 할필요도 없어져서 빨라짐)
//		 */
//		for(int i = list2.size()-1;i>=0;i--) {
//			if(list1.contains(list2.get(i))) {
//				list2.remove(i);
//			}
//		}
//		System.out.println();
//		System.out.println(list1);
//		System.out.println(list2);
		
		
		
		
		
		
		
		
	}

}
