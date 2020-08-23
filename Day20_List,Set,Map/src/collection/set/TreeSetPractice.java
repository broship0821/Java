package collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		
		Set set1 = new TreeSet(); // 자동으로 오름차순으로 정렬됨, 범위 검색, 정렬에 유리(정렬할 필요 없음)
//		Set set1 = new HashSet(); // 정렬 없음, 데이터가 자주 수정될때 유리
		
		for(int i=0;set1.size()<6;i++) {
			int num = (int) (Math.random()*45)+1;
			set1.add(num);
		}
		
		System.out.println(set1);
		
		
		
		System.out.println("------------------------------");
		
		
		
		
	}

}
