
public class LogicalOperator {

	public static void main(String[] args) {

		/*
		��(����) ������ (<, <=, >, >=, ==, !=)
			���װ� ������ ũ�⸦ ���Ͽ� ��������� �׻� ���� Ÿ�� ����
			������ (true, false)
		 */
		System.out.println(10 >= 10);
		
		System.out.println("------------------------------------------------------");
		
		/*
		 �� ������ (&, &&, |, ||)
		 	���װ� ������ ������ �����Ͽ� �ϳ��� ������ ������
		 1. &, &&: ���� ���� ������ ��� true�� ��쿡�� true ����
		 2. |, ||: ���� ���� ������ ���ʸ� true���� true ����
		 */
		
		int x = 10, y = 20;
		System.out.println(x > 10 & y < 30);
		System.out.println(x > 10 && y < 30);
		//����� �Ȱ����� �ؿ��� ������ false�� ������ ������ �ʰ� false �����, &&�� ���� �ӵ��� �� ����(���� �� ����)
		System.out.println(x > 10 || y < 30);
			
		System.out.println("------------------------------------------------------");
		
		/*
		 �� ���� ������ (!: ����)
		 	������ �ܼ��� ������Ŵ: true -> false, false -> true
		 */
		
		int z = 10;
		System.out.println(z == 10);
		System.out.println(!(z == 10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
