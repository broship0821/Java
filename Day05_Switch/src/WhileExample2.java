
public class WhileExample2 {

	public static void main(String[] args) {

		//48 ~ 150사이의 정수 중 8의 배수만 가로로 출력

		int i = 48;
		while(i<=150) {
			if(i%8==0) {
				System.out.printf(i + " ");
			}
			i++;
		}
		System.out.println();
		
		//1~100까지 정수중 4의 배수이면서 8의 배수는 아닌 수를 가로로 출력
		int j = 1;
		while(j<=100) {
			if(j%4==0 && j%8!=0) {
				System.out.print(j + " ");
			}
			j++;
		}
		System.out.println();
		
		//1~30000까지의 정수 중 258의 배수의 갯수를 구하기
		int k = 1;
		int count = 0;
		while(k<=30000) {
			if(k%258==0) {
				count++;
			}
			k++;
		}
		System.out.printf("1~30000중 258 배수의 갯수: %d\n", count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
