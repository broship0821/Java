package chap02;

import java.util.Arrays;

public class Q06cardConv {
	
	static void swap(char[] d, int j) {
		//j: d.length로 하면 32번째부터 저장되니 생성된 인덱스까지만 반복해서 앞에 두기
		for(int i=0;i<j/2;i++) {
			char tmp = d[i];
			d[i] = d[j-1-i];
			d[j-1-i] = tmp;
		}
	}
	
	static int cardConv(int x, int r, char[] d) {
		//x: 바꿀 정수, r: 진수, d: 결과값
		int i = 0;
		String data = "0123456789ABCDEF";
		//String에 담고 .charAt()으로 하나씩뽑아서 담기
		do {
			d[i++] = data.charAt(x%r);
			x /= r;
		}while(x!=0);
		
		swap(d, i);
		
		return i;
	}

	public static void main(String[] args) {
		
		int x = 59; //바꿀 정수
		int r = 2; //바꿀 진수
		char[] d = new char[32];
		
		System.out.println(cardConv(x, r, d) + "개 인덱스");
		System.out.println(Arrays.toString(d));

	}

}
