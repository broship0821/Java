import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {

		String[] names = new String[6];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<names.length;i++) {
			System.out.print("이름을 입력하세요: ");
			String name = sc.next();
			
			/*
			 자바에서는 문자열 동등 비교시 '==' 연산자를 사용하면
			 제대로 비교 불가
			 
			 문자열 String은 기본 데이터 타입이 아닌
			 객체 참조 타입임
			 
			 문자열 동등 비교를 진행할 때는
			 비교 문자열1.equals(비교문자열2)를 사용해야
			 문자열 동등 비교 가능
			 */
			
			if(name == "그만") { //문자열은 ==으로 비교 불가, 문자열의 내용이 똑같아도 서로 위치가 다름
				System.out.println("입력을 종료합니다");
				break;
			}
			
			if(name.equals("그만")) {
				System.out.println("입력을 종료합니다");
				break;
			}
			
			names[i] = name;
		}
		
		System.out.println(Arrays.toString(names));
		
		//null제외하고 출력하기
		System.out.println("---------------------------------");
		System.out.print("입력받은 이름: ");
		for(String str : names) {
			if(str == null) break;
			System.out.print(str + " ");
		}

	}

}
