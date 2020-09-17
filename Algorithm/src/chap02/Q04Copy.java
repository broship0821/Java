package chap02;

public class Q04Copy {
	
	static void copy(int[] a, int[] b) {
		int len = (a.length>=b.length)?b.length:a.length; //길이는 두 배열중 짧은 거로
		for(int i=0;i<len;i++) {
			a[i] = b[b.length-i-1]; //길이가 어떻든 b의 뒤에서부터 넣어야됨
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
