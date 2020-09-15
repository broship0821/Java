package chap01;

public class NumPira {
	
	static void spira(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++)
				System.out.print(" ");
			for(int j=1;j<=(i-1)*2+1;j++)
				System.out.print(i%10);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		spira(20);

	}

}
