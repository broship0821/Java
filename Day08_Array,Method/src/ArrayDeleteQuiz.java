import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {

		/*
		 1. 삭제할 이름을 입력받아서 해당 값을 삭제해 주세요
		 2. 삭제 후 정보도 출력해 주세요
		 3. 없으면 없는 이름이라고 출력해 주세요
		 */

		String[] kakao = {"무지", "네오", "어피치", "라이언", "제이지"};
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
		System.out.print("삭제할 친구 이름: ");
		String name = sc.next();

		boolean flag = true;
		//int i; 이렇게 할려면 삭제 로직을 for문 밖에 작성해야됨 for문 안에 작성하면 kakao.length가 하나 줄어들어서 마지막 인덱스 삭제할때 "없는 이름입니다." 같이 출력됨
		for(int i=0;i<kakao.length;i++) {
			if(name.equals(kakao[i])) { //삭제할 이름 찾기
				//int i 를 밖에다 선언했으면 break때리고 이 후부터는 for문 밖에 써도됨
				for(int j=i;j<kakao.length-1;j++) { //해당 이름 삭제
					kakao[j] = kakao[j+1];
				}
				String[] temp = new String[kakao.length-1]; //kakao보다 하나 작은 배열 생성
				for(int j=0;j<temp.length;j++) { //kakao값 temp에 대입
					temp[j] = kakao[j];
				}
				kakao = temp; //kakao가 temp 위치 참조(기존 kakao는 자동 사라짐)
				temp = null;//안쓰는 temp null값주기
				System.out.println("삭제 후 정보: " + Arrays.toString(kakao));
				flag = false;//삭제할 이름 찾았으면 없는 이름이라고 출력할 필요 없어짐
				//break;
			}
		}
		if(flag) {
			System.out.println("없는 이름입니다.");
		}
		
		sc.close();
	}

}
