
public class PlusMinusOperator {

	public static void main(String[] args) {

		int i = 1;
//		i++;
//		System.out.println(i);
//		++i;
//		System.out.println(i);
//		i--;
//		System.out.println(i);
//		--i;
//		System.out.println(i);
		
		int j = i++; //���� ����, �� ���� �� ����
		int k = i--;
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("k: " + k);

		System.out.println("----------------------------------------------");
		
		int x = 1; //���� ����, �� ���� �� ����
		int y = ++x;
		int z = --x;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
		
	}

}
