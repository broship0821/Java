
public class WhileExample2 {

	public static void main(String[] args) {

		//48 ~ 150������ ���� �� 8�� ����� ���η� ���

		int i = 48;
		while(i<=150) {
			if(i%8==0) {
				System.out.printf(i + " ");
			}
			i++;
		}
		System.out.println();
		
		//1~100���� ������ 4�� ����̸鼭 8�� ����� �ƴ� ���� ���η� ���
		int j = 1;
		while(j<=100) {
			if(j%4==0 && j%8!=0) {
				System.out.print(j + " ");
			}
			j++;
		}
		System.out.println();
		
		//1~30000������ ���� �� 258�� ����� ������ ���ϱ�
		int k = 1;
		int count = 0;
		while(k<=30000) {
			if(k%258==0) {
				count++;
			}
			k++;
		}
		System.out.printf("1~30000�� 258 ����� ����: %d\n", count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
