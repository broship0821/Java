
public class PrintExample {

	public static void main(String[] args) {

		/*
		 자바의 표준 출력 형식 3가지
		 1. 개행을 포함하지 않는 print()
		 2. 자동으로 개행을 포함시켜 주는 println()
		 3. 형식 지정 표준 출력 함수 printf()
		 	%d = 부호가 있는 정수 데이터 (decimal)
		 	%f = 실수 데이터
		 	%s = 문자열
		 	%c = 문자
		 	
		 	# 탈출 코드(escape code), 모든 출력 형식에 사용 가능
		 	\n = 개행, 줄바꿈
		 	\t = 탭 정렬(4칸 들여쓰기)
		 */
		
		System.out.print("Hello");
		System.out.print("안녕하세요\n");
		System.out.println("bye");
		System.out.println("안녕하가세요");
		
		System.out.println("---------------------------------------------");
		
		int month = 12;
		int day = 25;
		String anni = "크리스마스";
		
		System.out.printf("%d월 %d일은 %s 입니다.\n\n\n", month, day, anni);
		System.out.printf("지금은 %s요일 \t%d시 %d분 입니다.", "수", 18, 16);
		
			
		
	}

}
