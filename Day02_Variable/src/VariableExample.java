
public class VariableExample {

	public static void main(String[] args) {

		/*
		 # ���� (variable)
		 ���α׷� ���� �� ���� ���Ǵ� ���� �����ϱ� ���� ����
		 1. ������ �����Ͱ� ���ڿ���� ������ �̸��� �ٿ����� ���Դϴ�.
		 2. ������ �����Ҷ� ������ ����Ǵ� �������� ũ��� ��翡 ����
		 ������ ������ Ÿ���� ����
		 ex) int: 4byte ����, String: ���ڿ�(����)
		 3. ������ ������ �̸����� �ߺ� ������ �� ����
		 4. ���� ������ ���� �������� ���氡��
		 */
		
		// ������ ����: �ڷ���(������ Ÿ��) ������;
		int age;
		
		// ������ �ʱ�ȭ: ������ = ��;
		age = 20; // = :���� ������ ������ ���� ������ ��, ������ ������ ������ ���� ���Խ�Ŵ

		// ������ �� ����(���)
		System.out.println(age);
		
		// ������ ����� ���ÿ� �ʱ�ȭ ���� ����, �� ó�� ����� 1ȸ�� ����
//		int score;
//		score = 95;
		
		int score = 95;
		System.out.println(score);
		
//		int score = 90; Error, �Ȱ��� ������ ��� �Ұ���
		score = 90; //������ �� ����� �ڷ����� ���� ����
		System.out.println(score);
		
		//�������� �ٸ� ������ ���� ���� ����
		int doubleScore = score * 2;
		System.out.println(doubleScore);
		
		//������ �ڷ����� ���� �ʴ� �����ʹ� ���� �Ұ���
//		int count = "�ѹ�"; Error
//		int count = 24.5; Error
//		String str = 100; Error
		
		//������ �ڷ����� �޶� �̸��� �����ϴٸ� �ߺ� ������ �� ����
		String name = "ȫ�浿";
//		int name = 572; error
		
		//���� �� �ʱ�ȭ���� ���� ������ ���� �Ұ���
//		int result = doubleScore + num Error, num�� �������� ����
		int result;
//		System.out.println(result); //Error, ���� ������(�ʱ�ȭ����������) ��µ��� ����, �ʱ�ȭ �ʿ�
		
	}

}
