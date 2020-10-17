package collection;

import java.util.ArrayList;
import static java.util.Collections.*;
import java.util.List;

public class CollectionsEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5);
		System.out.println(list);

		rotate(list, 2);
		System.out.println(list);
		
		swap(list, 0, 3);
		System.out.println(list);
		
		shuffle(list);
		System.out.println(list);
		
		sort(list, reverseOrder());
		System.out.println(list);
		
		sort(list);
		System.out.println(list);
		
		int i = binarySearch(list, 3); //3은값, 3의 위치를 찾아줌
		System.out.println("3의 인덱스 위치: " + i);
		
		System.out.println("max: " + max(list));
		System.out.println("min: " + min(list));
		
		fill(list, 9);
		System.out.println("list: " + list);
		
		List newList = nCopies(list.size(), 2); //읽기전용
		System.out.println("newList: " + newList);
//		newList.add(1); //추가 안됨
		
//		list.add(2);
		System.out.println(disjoint(list, newList)); //공통요소가 없으면 true
		
		copy(list, newList);
		System.out.println("newList: " + newList);
		System.out.println("list: " + list);
		
		replaceAll(list, 2, 1); //list안에 모든 2를 1로 바꿈
		System.out.println("list: " + list);
		
		
	}

}
