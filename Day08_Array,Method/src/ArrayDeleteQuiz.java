import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {

		/*
		 1. ������ �̸��� �Է¹޾Ƽ� �ش� ���� ������ �ּ���
		 2. ���� �� ������ ����� �ּ���
		 3. ������ ���� �̸��̶�� ����� �ּ���
		 */

		String[] kakao = {"����", "�׿�", "����ġ", "���̾�", "������"};
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ����� ģ����: " + Arrays.toString(kakao));
		System.out.print("������ ģ�� �̸�: ");
		String name = sc.next();

		boolean flag = true;
		//int i; �̷��� �ҷ��� ���� ������ for�� �ۿ� �ۼ��ؾߵ� for�� �ȿ� �ۼ��ϸ� kakao.length�� �ϳ� �پ�� ������ �ε��� �����Ҷ� "���� �̸��Դϴ�." ���� ��µ�
		for(int i=0;i<kakao.length;i++) {
			if(name.equals(kakao[i])) { //������ �̸� ã��
				//int i �� �ۿ��� ���������� break������ �� �ĺ��ʹ� for�� �ۿ� �ᵵ��
				for(int j=i;j<kakao.length-1;j++) { //�ش� �̸� ����
					kakao[j] = kakao[j+1];
				}
				String[] temp = new String[kakao.length-1]; //kakao���� �ϳ� ���� �迭 ����
				for(int j=0;j<temp.length;j++) { //kakao�� temp�� ����
					temp[j] = kakao[j];
				}
				kakao = temp; //kakao�� temp ��ġ ����(���� kakao�� �ڵ� �����)
				temp = null;//�Ⱦ��� temp null���ֱ�
				System.out.println("���� �� ����: " + Arrays.toString(kakao));
				flag = false;//������ �̸� ã������ ���� �̸��̶�� ����� �ʿ� ������
				//break;
			}
		}
		if(flag) {
			System.out.println("���� �̸��Դϴ�.");
		}
		
		sc.close();
	}

}
