
public class ConOperatorQuiz {

	public static void main(String[] args) {

		int num = (int) (Math.random()*124 + 14);
		System.out.printf("발생한 난수: %d\n", num);
		
		boolean value;
		if(num%2==0) {
			value = true;
		}
		else {
			value = false;
		}
		
		String result = (value? "짝수" : "홀수");
		System.out.printf("3항 연산의 결과: %s입니다.\n", result);
		
		String result1 = (num%2==0 ? "짝수입니다." : "홀수입니다.");
		System.out.printf("3항 연산의 결과: %s\n", result1);
	}

}
