
public class TextualExample {

	public static void main(String[] args) {

		/*
		 # ���� ���ڸ� �����ϴ� ������ Ÿ�� char
		 	�����ϰ� ���� ���ڸ� Ȭ����ǥ('')�� ��� ����
		 */
		char c1 = 'a';
		System.out.println(c1);
		
		char c2 = 65;
		System.out.println(c2);
		
		char c3 = 44032;
		System.out.println(c3);
		
		/*
		 # ���ڿ��� ������ �� �ִ� ������ Ÿ�� String
		 	�����ϰ� ���� ���ڿ��� �����ǥ("")�� ��� ����
		 	String�� �⺻ ������ Ÿ���� �ƴ����� ���� ���̱� ������
		 	�⺻ ������ Ÿ��ó�� ��� (����� ��ü)
		 */
		
		String s1 = "my dream ";
		String s2 = "is a programmer";
		System.out.print(s1);
		System.out.print(s2+"\n");
		
		//�ڹٿ����� ���ڿ��� ���� ������ ������
		//���� ����� ���ڿ��� �����Ͽ� ������ ����� �����
		
		
		System.out.println(s1+s2+" hhhhh");
		
		//���ڿ��� �ٸ� ������ Ÿ�԰��� ���� ����
		System.out.println("----------------------------------------------------");
		System.out.println(100+100);
		System.out.println("100"+"100");
		System.out.println(100+"100"); //��ü ����� ���ڿ��� ��
		System.out.println(3.14+"hi");
		
		int month = 10;
		int day = 13;
		
		//�� ������ 10�� 13�� �Դϴ�.
		System.out.println("�� ������ " + month + "�� " + day + "�� �Դϴ�."); // �ٸ� ������ Ÿ�Գ��� ���ص� ���ڿ��� �Ǳ� ������ �̷��� ��� ����
		
		
		
		
		
		
		
		
		
		
		

	}

}
