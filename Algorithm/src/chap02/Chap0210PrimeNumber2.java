package chap02;

public class Chap0210PrimeNumber2 {

	public static void main(String[] args) {

		//1처럼 했을때 숫자 1000이면 1에서 1000까지의 모든 숫자를 다 나눠야됨
		//소수를 배열에 저장해서 그 소수로만 나누면 결과는 똑같은데 나눗셈 횟수가 줄어듬
		int counter = 0; //나눗셈 횟수
		int ptr = 0; //찾은 소수의 개수
		int[] prime = new int[500000]; //소수를 저장하는 배열
		
		prime[ptr++] = 2; //소수인 2 먼저 넣어줌
		
		for(int n=3;n<=1000000;n+=2) { //2를 제외한 짝수는 소수가 아니기 때문에 홀수만 나눔
			int i;
			for(i=1;i<ptr;i++) { //배열에 담은 소수들로 나누어 보기
				counter++;
				if(n%prime[i]==0) break; //나우어 떨어지면 소수가 아님
			}
			if(ptr==i) //마지막까지 나누어떨어지지 않음
				prime[ptr++] = n; //해당 숫자는 소수, 배열에 저장
		}
		
		for(int i=0;i<ptr;i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("나눗셈을 수행한 횟수: " + counter); //1보다 훨신 적어짐
		

	}

}
