
public class LoopNesting {

	public static void main(String[] args) {

		/*
		 �ݺ��� ��ø (Loop Nesting)
		 	�ܺ� �ݺ��� ���ο� ���� �ݺ����� �����ϴ� ���¸� �ݺ��� ��ø�̶�� �մϴ�.
		 	�ݺ��� ��ü�� �ݺ����Ѿ� �� ��쿡 ���
		 	
		 	���� �ݺ����� ���ᰡ �Ǿ �ܺ� �ݺ����� ������ �ʴ´ٸ�
		 	���� �ݺ����� �ܺ� �ݺ����� ������� ũ�� �� �������� ����ؼ�
		 	�ݺ� ����ǰ� �˴ϴ�.
		 */

		for(int dan=2;dan<=9;dan++) {
			System.out.println("������" + dan + "��");
			System.out.println("-----------------");
			
			for(int i=1;i<=9;i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			}
			
			System.out.println("-----------------");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
