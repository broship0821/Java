
public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		 ũ�Ⱑ ���� ������ Ÿ���� �ڷḦ ū ������ Ÿ������ ��Ȱ�� ����
		 �ڹ� ����ӽ�(JVM)�� �ڵ����� Ÿ���� �÷��� ��ȯ����
		 (promotion, upcasting)
		 */
		
		byte b = 10;
		int i = b; //�ڵ����� b�� int�� �ٲ���
		System.out.println(i);
		
		char c = 'A';
		int j = c;
		System.out.println("A�� �����ڵ� ��ȣ: " + j);
		
		int k = 500;
		double d = k;
		System.out.println(d);
		

	}

}
