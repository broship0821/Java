package collection.set;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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
		

	}

}
