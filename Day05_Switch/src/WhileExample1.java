
public class WhileExample1 {

	public static void main(String[] args) {

		//1~10���� ������ ���ϱ�
//		
//		int sum = 0;
//		int i = 0;
//		while(i<10) {
//			i++;
//			sum += i;
//		}
//		System.out.println(sum);
		
		// �ݺ����� 3 ���: begin, end, step
		
		int total = 0; // �������� ����� ����
		int n = 1; //�����: �ݺ����� Ƚ���� ������ ����(begin)
		while(n<=10) { // ���� ���ǽ�: �ݺ����� ���� ����(end)
			total += n;
			n++; // ������: �ݺ����� ���Ḧ ���� ������� ���� ����(step)
		}
		System.out.printf("1~10�� ������: %d\n", total);
		
		System.out.println("-------------------------------------");
		
		int i = 0;
		while(i<10) {
			System.out.println("�ݰ����ϴ�");
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
