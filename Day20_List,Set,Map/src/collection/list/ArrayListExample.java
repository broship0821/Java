package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
//		String str = new String[100];
		ArrayList<String> nick = new ArrayList<>();
		
		String str1 = "멍멍이";
		String str2 = "야옹이";
		
		//List에 객체를 추가: add(객체)
		nick.add(str1);
		nick.add(str2);
		nick.add(new String("짹짹이"));
		nick.add("개구리");
		nick.add("야옹이"); //list는 객체의 중복 저장을 허용한다
		System.out.println(nick);
		
		//list에 객체를 추가: add(index, 객체) -> 객체를 해당 인덱스에 삽입
		nick.add(2, "어흥이");
		System.out.println(nick);
		
		//list에 저장된 총 객체의 수 얻기: size()
		System.out.println("nick에 저장된 요소의 갯수: " + nick.size());
		
		//list에 저장된 객체 참조하기: get(index)
//		String nickname = nick[4]; x
		String nickname = nick.get(3);
		System.out.println("4번 인덱스의 값: " + nickname);
		
		//list 데이터 수정: set(index, 수정할 객체)
		nick.set(3, "메롱이");
		System.out.println(nick);
		
		//list에 저장된 객체를 삭제: remove(index), remove(객체)
		nick.remove(5);
		System.out.println(nick);
		
		//list 내부 객체의 존재 유무를 확인: contains(객체)
		System.out.println(nick.contains("멍멍이"));
		System.out.println(nick.contains("삐약이"));
		
		//list 내부 객체의 인덱스 확인: indexOf(객체)
		int idx = nick.indexOf("어흥이");
		System.out.println("어흥이가 위치한 인덱스: " + idx);
		
		//list의 반복문 처리
		for(String s : nick) {
			System.out.println(s + "키우고 싶다");
		}
		
		System.out.println(nick.get(1)); //일반 for문에서는 get 써서 하면됨
		
		//list의 내부 객체 전체 삭제: clear()
		nick.clear();
		System.out.println(nick);
		
		//isEmpty: list 내부가 비어있는지 여부 체크
		System.out.println(nick.isEmpty());
		
		//list의 정렬
		List<Integer> scores = new ArrayList<>();
		scores.add(10);
		scores.add(70);
		scores.add(90);
		scores.add(20);
		scores.add(50);
		scores.add(4);
		
		//오름차정렬
		System.out.println(scores);
		Collections.sort(scores);
		System.out.println(scores);
		
		//내림차정렬
		Collections.sort(scores, Collections.reverseOrder());
		System.out.println(scores);

	}

}
