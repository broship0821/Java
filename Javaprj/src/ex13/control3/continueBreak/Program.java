package ex13.control3.continueBreak;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.print("���� sp�� �̿��ؼ� 5�� �̻� �ۼ��Ͻÿ�:");
		
		while(scan.hasNext()) {
			a = scan.nextInt();
			
			if(a>10)
				continue;
			
			if(a < 0)
				break;
			
			System.out.println(a);
		}
	}
}