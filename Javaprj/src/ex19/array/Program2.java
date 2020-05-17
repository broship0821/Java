package ex19.array;

public class Program2 {

	public static void main(String[] args) {
		int[] num1 = {1,2,3};
		int[] num2 = {4,5,6};
		int[] num = new int[6];
		
		for(int i=0;i<3;i++)
			num[i] = num1[i];
		for(int i=0;i<3;i++)
			num[i+3] = num2[i];
		for(int i=0;i<6;i++)
			System.out.printf("%d", num[i]);

	}

}
