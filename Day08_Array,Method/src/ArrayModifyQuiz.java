import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuiz {

	public static void main(String[] args) {

		/*
		 1. �迭�� �����ϰ� ģ������ �̸��� ����
		 {"����", "�׿�", "����ġ", "���̾�", "������"} String[] kakao
		 2. ����ڿ��� ������ ģ�� �̸��� �Է¹޾Ƽ� �Է��� ģ���� �迭�� �����Ѵٸ�
		 ������ ���� �ٽ� �Է¹�������.
		 3. �̸��� ������ �Ŀ� "���� �� ���:~~"�� ����ϼ���.
		 4. ����ڰ� �Է��� �̸��� �迭�� ���ٸ� "xxx�� ���� �̸��Դϴ�." �� ����ϼ���
		 */

		String[] kakao = {"����", "�׿�", "����ġ", "���̾�", "������"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ����� ģ����: " + Arrays.toString(kakao));
		
		System.out.print("������ ģ�� �̸�: ");
		String name = sc.next();
		
		int i;
		for(i=0;i<kakao.length;i++) {
			if(name.equals(kakao[i])) {
				System.out.print("�ٲٰ� ���� �̸�: ");
				kakao[i] = sc.next();
				break;
			}
		}
		
		if(i==kakao.length) {
			System.out.printf("%s(��)�� ���� �̸��Դϴ�.", name);
		} else {
			System.out.println("���� �� ���: " + Arrays.toString(kakao));
		}
		
		sc.close();
	}

}
