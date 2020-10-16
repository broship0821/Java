package collection.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("peter", "0821");
		map.put("dragon", "1111");
		map.put("dragon", "1234");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id, password 입력");
			System.out.print("ID: ");
			String id = sc.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("존재하지 않는 id 입니다.");
				continue;
			}
			System.out.print("PW: ");
			String pw = sc.nextLine().trim();
			System.out.println();
			
			if(!pw.equals(map.get(id))) {
				System.out.println("잘못된 비밀번호 입니다.");
			} else {
				System.out.println("로그인 성공.");
				break;
			}
		}

	}

}
