
public class ForExample {

	public static void main(String[] args) {

		//1~10������ ������
		
//		//while ���¹�
//		int n = 1;
//		int total = 0;
//		while(n<=10) {
//			total +=n;
//			n++
//		}
		
		//for������ ����
		int total = 0;
		for(int i=1;i<=10;i++) {
			total += i;
		}
		System.out.println(total);
		
		//����,������ �˰� ������ for��, �𸣸� while��
		
		//1~200������ ���� �� 6�� ����̸鼭 12�� ����� �ƴ� ���� ���η� ���
		
		for(int i=1;i<=200;i++) {
			if(i%6==0 && i%12!=0) {
				System.out.printf("%d ", i);
			}
		}
		
		System.out.println();
		
		//1~60000������ ���� �� 177�� ����� ������ ���
		int count = 0;
		for(int i=1;i<=60000;i++) {
			if(i%177==0) {
				count++;
			}
		}
		System.out.printf("177 ����� ����: %d��\n", count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
