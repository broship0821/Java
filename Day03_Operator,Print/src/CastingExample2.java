
public class CastingExample2 {

	public static void main(String[] args) {

		/*
		 ũ�Ⱑ ū ������Ÿ���� ���� ���� ������ Ÿ������ ��ȯ�Ϸ���
		 �ݵ�� �� ��ȯ ������: (type)�� ����Ͽ� ���������
		 �� ��ȯ�� �����ؾߵ�
		 (downcasting, type casting)
		 
		 ��������� �� ��ȯ�� �ϴ� ������ ��������� �پ���
		 ������ �ս��� ���ɼ��� �׻� �ֱ� ����
		 (overflow, underflow)
		 */
		
		int i = 72;
		char c = (char) i;
		System.out.println("72�� ���ڰ�: " + c);
		
		double d = 4.98765;
		int j = (int) d; // �� �ս�: �ڱⰡ ǥ�� ���ϴ°� �� ����
		System.out.println(j);

		int k = 1000;
		byte b = (byte) k;
		System.out.println(b);
		// 2������ �ٲ� �� byte�� ���� �� �ִ� 8��Ʈ ���� ©�� ����
			
	}

}
