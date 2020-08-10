package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		/*
		 HashSet 클래스는 Set 인터페이스를 구현한 클래스 입니다.
		 저장된 객체의 순서를 보장하지 않고, 중복 또한 허용하지 않습니다.
		 
		 Set 인터페이스를 구현한 클래스 중 대표적으로 사용하는 클래스
		 중 하나입니다.
		 */
		
		Set<String> set = new HashSet<>();
		
		//set에 객체를 추가: add(객체)
		set.add("김밥");
		set.add("김말이");
		set.add("떡볶이");
		set.add("단무지");
		set.add("김말이"); //set은 중복 안됨
		System.out.println(set); //set은 순서가 일정하지 않음
		
		//리스트, set은 사용하기 쉬운대신 느림, 배열은 사용하기 어려운대신 빠름
		
		//set에 저장된 객체 수를 알아보는 메서드: size()
		System.out.println(set.size());
		
		/*
		 set의 객체 데이터를 검색하려면 반복자(Iterator)를 통해
		 모든 객체를 대상으로 한번씩 반복해서 꺼내봐야됨
		 */
		Iterator<String> iter = set.iterator();

		//Iterator의 next()메서드는 set에 저장된 객체를 하나씩 꺼내옴
		
		
		/*
		 반복자 객체의 next()를 통해 set의 내부 데이터를
		 반복 조회할때, 더이상 조회할 데이터가 없으면 예외를 발생시킴
		 
		 그렇게 때문에 hasNext()메서드를 통해 set에서 데이터를
		 더 조회할 수 있는지의 여부를 항상 체크해야됨
		 */
		
		while(iter.hasNext()) { //set에 더 데이터가 있는지 확인, 데이터 없으면 false 반환
			System.out.println(iter.next()); //하나씩 꺼내옴
		}
		
		System.out.println("------------------------");
		
		for(String s : set) {
			System.out.println(s);
		}
		//향상 for문은 iterator를 포함하고 있음
		
		//set의 데이터 삭제: remove(객체)
		set.remove("단무지");
		System.out.println(set);
		
		//set을 list로 변환하는 방법
		List<String> list = new ArrayList<>(set);
		System.out.println(list);
		System.out.println(list.get(2));
		
		//set의 데이터 전체 삭제: clear()
		set.clear();
		System.out.println(set);
		
		
		
		
		

	}

}
