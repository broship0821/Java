
public class ConOperatorQuiz {

	public static void main(String[] args) {

		int num = (int) (Math.random()*124 + 14);
		System.out.printf("�߻��� ����: %d\n", num);
		
		boolean value;
		if(num%2==0) {
			value = true;
		}
		else {
			value = false;
		}
		
		String result = (value? "¦��" : "Ȧ��");
		System.out.printf("3�� ������ ���: %s�Դϴ�.\n", result);
		
		String result1 = (num%2==0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.");
		System.out.printf("3�� ������ ���: %s\n", result1);
	}

}
