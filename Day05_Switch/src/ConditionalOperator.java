
public class ConditionalOperator {

	public static void main(String[] args) {

		/*
		 ���� ������
		 	�� ������(������ ���ϴ� ��)�� 3���� �����ڸ� ����
		 	���ǽ� ? ���� : ����
		 	���ǽ��� ���Ͽ� true�� ����Ǿ��� �ÿ� ������,
		 	false�� ����Ǿ��� �ÿ� ������ ���� �����
		 */
		
		System.out.println(5==4 ? "��" : "����");
		
		String result = (5!=4 ? "��" : "����");
		
		System.out.println(result);

		
		//����(������)�� �߻���Ű�� �޼���
		// Math.random()
		// 0.0~1.0 �̸��� ���� �Ǽ����� ��ȯ
		
//		double rn = Math.random();
//		System.out.println(rn);
		
		// 1~10���� �ϴ� ���
//		int rn1 = (int)(Math.random()*10) + 1;
//		System.out.println(rn1);
		
		// 10~100����
		int rn2 = (int) ((Math.random()*91) + 10);
		System.out.println(rn2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
