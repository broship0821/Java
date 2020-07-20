
public class ForExample {

	public static void main(String[] args) {

		//1~10까지의 누적합
		
//		//while 쓰는법
//		int n = 1;
//		int total = 0;
//		while(n<=10) {
//			total +=n;
//			n++
//		}
		
		//for문으로 쓰기
		int total = 0;
		for(int i=1;i<=10;i++) {
			total += i;
		}
		System.out.println(total);
		
		//시작,끝값을 알고 있으면 for문, 모르면 while문
		
		//1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를 가로로 출력
		
		for(int i=1;i<=200;i++) {
			if(i%6==0 && i%12!=0) {
				System.out.printf("%d ", i);
			}
		}
		
		System.out.println();
		
		//1~60000까지의 정수 중 177의 배수의 갯수를 출력
		int count = 0;
		for(int i=1;i<=60000;i++) {
			if(i%177==0) {
				count++;
			}
		}
		System.out.printf("177 배수의 갯수: %d개\n", count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
