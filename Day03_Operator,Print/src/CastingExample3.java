
public class CastingExample3 {

	public static void main(String[] args) {

		/*
		���� Ÿ���� �ٸ� �⺻ �������� ����ÿ��� ������ Ÿ���� ū �ʿ�
		�������� �ڵ����� �� ��ȯ�� ����� �ڿ� ���� ����
		 */
		
		char c = 'B';
		int i = 2;
		
		int intResult = c + i; // int�� �� ũ�� int Ÿ���̵�
		char charResult = (char)(c+i);
		System.out.println(intResult);
		System.out.println(charResult);
		
		
		int k = 10;
//		double d = k / 4; // int�� int�� ����
		double d = k / 4.0;//(double)k / 4; //�ϳ��� double�� �ٲ��ָ� �ڵ����� ����ȯ��
		System.out.println(d);
		
		
		byte b1 = 100;
		byte b2 = 70;
		System.out.println(b1 + b2); //int ���� ���� ũ���� ������ ������ �ڵ����� int�� �ٲ㼭 �������(������ �ս� ����,�����÷ο� ����)
		
			
				
	}

}
