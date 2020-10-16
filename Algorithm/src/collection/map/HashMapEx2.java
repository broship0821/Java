package collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("일길동", 80);
		map.put("일길동", 100);
		map.put("이길동", 90);
		map.put("삼길동", 100);
		map.put("사길동", 90);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름: " + e.getKey() + ", 점수: " + e.getValue());
		}
		set = map.keySet();
		System.out.println("참가자 명단: "+ set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total =0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + (double)total/map.size());
		System.out.println("최고 점수: " + Collections.max(values));
		System.out.println("최저 점수: " + Collections.min(values));

	}

}
