package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		/*
		 Map 계열 컬렉션은 키(key)와 값(value)이 한 쌍으로 구성된
		 객체를 저장하는 구조를 가지고 있습니다
		 
		 키는 중복 저장을 허용하지 않지만 값은 중복 저장을 허용합니다.
		 */
		
		Map<String, String> map = new HashMap<>();
		
		//map에 객체를 저장: put(key, value)
		map.put("멍멍이", "김철수");
		map.put("야옹이", "홍길동");
		map.put("짹짹이", "박영희");
		
		System.out.println(map);
		
		//map은 key의 중복 저장을 허용하지 않습니다.
		//만약 이미 있는 key를 통해 put을 사용하면 value가 수정됩니다.
		map.put("멍멍이", "박철수");
		System.out.println(map);
		//value는 중복 저장 가능
		map.put("어흥이", "홍길동");
		System.out.println(map);
		
		//map에 저장된 value값을 참조: get(key)
		String name = map.get("야옹이");
		System.out.println("별명이 야옹이인 학생: " + name);
		
		//map에 저장된 총 객체의 수 얻기: size()
		System.out.println("map에 저장된 객체 수: " + map.size());
		
		System.out.println("----------------------------");
		//map에 저장된 key들만 전부 추출하는 메서드: keySet()
		//keySet을 사용하면 map안에 있는 모든 key들이 set으로 포장되서 반환됩니다.
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + " : " + map.get(k));
		}
		
		//map에 저장된 key의 존재 유무를 확인하는 메서드: containsKey(key)
		String nick = "짹짹이";
		if(map.containsKey(nick)) {
			System.out.printf("별명이 %s인 학생의 이름은 %s입니다.\n", nick, map.get(nick));
		}
		else {
			System.out.println("존재하지 않는 별명입니다.");
		}
		
		//map의 데이터 삭제: remove(key)
		//remove메서드에 key를 넣어주면 value도 함께 제거됨
		map.remove("야옹이");
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
