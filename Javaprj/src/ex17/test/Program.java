package ex17.test;

public class Program {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			if(i==4)
				System.out.printf("%c", 'A'+i);
			else if(i%2==0)
				System.out.printf("%c, ", ' ');
			else
				System.out.printf("%c, ", 'A'+i);
		}
		System.out.println();
		
		
		for(int j=0;j<3;j++) {
			for(int i=0;i<3;i++)
				System.out.printf("%d", 3*j+i+1);
		System.out.println();
		}
		
		}
	}


