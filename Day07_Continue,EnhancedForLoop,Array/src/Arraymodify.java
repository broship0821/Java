import java.util.Arrays;
import java.util.Scanner;

public class Arraymodify {

	public static void main(String[] args) {

		String[] foods = {"����", "����", "����", "�ܹ���"};
		System.out.println(Arrays.toString(foods));

		foods[2] = "¥���";
		foods[0] = "������";
		System.out.println(Arrays.toString(foods));
		
		//�迭�� index��ȣ Ž��
		Scanner sc = new Scanner(System.in);
		System.out.print("Ž���� ������ �Է��ϼ���: ");
		String name = sc.next();
		//��� for���� �ε�����ȣ�� �˼� ����
//		for(String food : foods) {
//			if(food.equals(name)) {
//				food = "�ֵ���";
//			}
//		}
		//���� ���� �˻������� ���� �����Դϴ� ��� ����ϱ�!!!!!!
		for(int i=0;i<foods.length;i++) {
			if(foods[i].equals(name)) {
				System.out.println("Ž�� �Ϸ�!");
				System.out.println(name + "�� �ε��� ��ȣ: " + i + "��");
				break;
			}
		}
		
	}

}
