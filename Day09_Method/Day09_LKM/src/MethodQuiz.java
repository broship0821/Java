
public class MethodQuiz {
	
	static int calc_divisor(int n) {
		int total = 0;
		System.out.print(n + "의 약수: ");
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				total += i;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		return total;
	}

	public static void main(String[] args) {
		
		/*
		 1. 정수를 하나 전달받아서 해당하는 수의 약수의 총합을 구해서
		 그 총합을 리턴하는 메서드를 선언하세요.
		 
		 2. 이 메서드는 매개값으로 받은 정수의 모든 약수를 가로로 출력한 후
		  그 약수들의 총합을 리턴해 주는 메서드입니다.
		  
		 3. 메서드 선언을 완료한 후에 메서드를 호출하여
		 10의 약수의 총합, 72의 약수의 총합을 구해보세요. (calc_divisor)
		 */
		
		System.out.println("10의 약수의 총합: " + calc_divisor(10));
		System.out.println("72의 약수의 총합: " + calc_divisor(72));
		
		
		
		
		
		
		

	}

}
