import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuiz {

	public static void main(String[] args) {

		/*
		 1. 배열을 선언하고 친구들의 이름을 저장
		 {"무지", "네오", "어피치", "라이언", "제이지"} String[] kakao
		 2. 사용자에게 수정할 친구 이름을 입력받아서 입력한 친구가 배열에 존재한다면
		 수정할 값을 다시 입력받으세요.
		 3. 이름을 수정한 후에 "수정 후 결과:~~"를 출력하세요.
		 4. 사용자가 입력한 이름이 배열에 없다면 "xxx는 없는 이름입니다." 를 출력하세요
		 */

		String[] kakao = {"무지", "네오", "어피치", "라이언", "제이지"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
		
		System.out.print("수정할 친구 이름: ");
		String name = sc.next();
		
		int i;
		for(i=0;i<kakao.length;i++) {
			if(name.equals(kakao[i])) {
				System.out.print("바꾸고 싶은 이름: ");
				kakao[i] = sc.next();
				break;
			}
		}
		
		if(i==kakao.length) {
			System.out.printf("%s(이)는 없는 이름입니다.", name);
		} else {
			System.out.println("수정 후 결과: " + Arrays.toString(kakao));
		}
		
		sc.close();
	}

}
