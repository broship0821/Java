package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz {

	public static void main(String[] args) {
		
		/*
		 1. engKor이라는 이름으로 map을 하나 생성하세요.
		 
		 2. 사용자가 "그만"을 입력할때까지 영단어를 입력받습니다.
		 
		 3. 총 두번을 입력받는데, 영단어를 key로, 한글 뜻을 value값으로
		 지정하여 Map에 등록하세요.
		 
		 4. "그만"을 입력받아 단어장 만들기를 종료하면,
		 그동안 입력받았던 사전의 내부 데이터를 전부 출력하세요.
		 영단어 : 한글뜻...
		 */
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> engKor = new HashMap<>();
		
		System.out.println("[영어 단어장 만들기]");
		System.out.println("종료하시려면 영단어 입력창에 '그만'을 입력하세요.");
		while(true) {
			System.out.print("영단어 입력: ");
			String eng = sc.next();
			if(eng.equals("그만")) {
				break;
			}
			else if(engKor.containsKey(eng)) {
				System.out.println("이미 등록된 단어입니다.");
				continue;
			}
			System.out.print("한글 뜻 입력: ");
			String kor = sc.next();
			System.out.println("단어 저장 완료!");
			System.out.println("------------------");
			engKor.put(eng, kor);
		
		}
		Set<String> keys = engKor.keySet();
		
		System.out.println("*** 오늘 공부한 단어 ***");
		System.out.println("------------------");
		for(String s : keys) {
			System.out.println(s + " : " + engKor.get(s));
		}
		System.out.println("------------------");
		sc.close();
		
//		System.out.println(engKor);
	}

}
