
public class BreakExample {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if(i > 7) break; //제어문이 한줄이면 한줄로 표현하는게 좋음
			System.out.print(i + " ");
		}
		System.out.println("\n반복문 종료!");

		System.out.println("-------------------------");
		
//		for(int i=0;i<=2;i++) {
//			for(int j=0;j<=1;j++) {
//				if(i==j) break;
//				System.out.println(i + "-" + j);
//			}
//		}
		
		/*
		 내부 반복문에 포함된 break로 바깥쪽 반복문까지 한번에
		 종료시키고 싶다면 바깥쪽 반복문에 label을 붙입니다.
		 그리고 break 선언시 label을 함께 선언합니다.
		 */
		
		outer: for(int i=0;i<=2;i++) { //반복문에 이름 붙이기
			for(int j=0;j<=1;j++) {
				if(i==j) break outer; //해당 반복문 중지
				System.out.println(i + "-" + j);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
