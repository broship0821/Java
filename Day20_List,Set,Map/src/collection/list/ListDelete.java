package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDelete {

	public static void main(String[] args) {

		/*
		 1. list의 문법을 이용하여 삭제를 구현해 보기
		 2. 없다면 없다고 표시
		 */
		
		Scanner sc = new Scanner(System.in);
		List<String> kakao = new ArrayList<>();
		kakao.add("무지");
		kakao.add("네오");
		kakao.add("어피치");
		kakao.add("라이언");
		kakao.add("제이지");
		
		System.out.println("현재 저장된 친구들: " + kakao);
		System.out.print("삭제할 친구를 입력하세요: ");
		String name = sc.next();
		
		if(kakao.contains(name)) {
			kakao.remove(name);
			System.out.println(name + "이 삭제되었습니다.");
		}
		else {
			System.out.println(name + "은 존재하지 않습니다");
		}
		System.out.println("현재 저장된 친구들: " + kakao);
		
		sc.close();

	}

}
