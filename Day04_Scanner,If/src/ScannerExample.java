import java.util.Scanner;

// 1. Scanner api 로딩: main에 scanner 쓰고 컨트롤 스페이스


public class ScannerExample {

	public static void main(String[] args) {

		//2. Scanner 객체를 생성
		Scanner sc = new Scanner(System.in);
		
		/*
		 3. Scanner 함수들을 이용하여 데이터를 입력받을 수 있음
		 - next(): 공백이 없는 문자열을 입력받음
		 - nextLine(): 공백을 포함하는 문자열을 입력받음
		 - next + 기본타입이름(): 해당 타입에 맞는 문자열을 입력받음
		 ex) 
		 	nextInt(): 정수 데이터 입력받음
		 	nextDouble(): 실수 데이터 입력받음
		 */

		System.out.print("이름을 입력하세요: ");
//		String name = sc.next(); //sc(Scanner)의 next()함수를 이용해서 입력받은 값을 name 문자열에 대입
		String name = sc.nextLine(); //공백까지 포함해서 출력해줌
//		System.out.println(name);
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
			
		
		System.out.println();
		System.out.printf("제 이름은 %s이고 나이는 %d세 입니다.\n", name, age);
		
		
		//4. Scanner 객체를 반납
		//객체반납: Scanner를 메모리에서 해제
		sc.close();
		
		
		
		
		
		
		
		
	}

}
