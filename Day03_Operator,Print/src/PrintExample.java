
public class PrintExample {

	public static void main(String[] args) {

		/*
		 �ڹ��� ǥ�� ��� ���� 3����
		 1. ������ �������� �ʴ� print()
		 2. �ڵ����� ������ ���Խ��� �ִ� println()
		 3. ���� ���� ǥ�� ��� �Լ� printf()
		 	%d = ��ȣ�� �ִ� ���� ������ (decimal)
		 	%f = �Ǽ� ������
		 	%s = ���ڿ�
		 	%c = ����
		 	
		 	# Ż�� �ڵ�(escape code), ��� ��� ���Ŀ� ��� ����
		 	\n = ����, �ٹٲ�
		 	\t = �� ����(4ĭ �鿩����)
		 */
		
		System.out.print("Hello");
		System.out.print("�ȳ��ϼ���\n");
		System.out.println("bye");
		System.out.println("�ȳ��ϰ�����");
		
		System.out.println("---------------------------------------------");
		
		int month = 12;
		int day = 25;
		String anni = "ũ��������";
		
		System.out.printf("%d�� %d���� %s �Դϴ�.\n\n\n", month, day, anni);
		System.out.printf("������ %s���� \t%d�� %d�� �Դϴ�.\n", "��", 18, 16);
		
		System.out.println("---------------------------------------------");
		
		/*
		 %f�� �⺻������ �Ҽ��� 6�ڸ����� ǥ���ϵ��� ����Ǿ� �ֽ��ϴ�.
		 ���� �ڸ����� �����Ϸ��� %.(�ڸ����� �ش��ϴ� ����)f�� ���(�ڵ� �ݿø�)
		 */
		
		double rate = 63.456;
		System.out.printf("���� �հݷ�: %.1f%%", rate); //%�� �ڵ����� ���Ĺ��ڷ� �ν��ϱ� ������ %%�� %�� ��ߵ�
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
