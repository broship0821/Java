package reference;

import java.util.Scanner;

public class CompareStr {

	public static void main(String[] args) {

		String str1 = "hello";
		String str2 = "hello";
		System.out.println(str1==str2);
		//이 경우 String constant pool 이라는 메모리 영역에
		//똑같은 문자열이 있기 때문에 같은 곳을 참조시킴, 그래서 true 나옴
		String str3 = new String("hello");
		//이러면 똑같은 문자열이 있어도 새롭게 만듬, 그래서 false 나옴
		System.out.println(str1==str3);
		//문자열 동등 비교 할때는 == 보다는 equals 써야됨
		
		Scanner sc = new Scanner(System.in);
		
		User kim = new User("abc1234");
		
		System.out.print("비밀번호 입력: ");
		String password = sc.next();
		
		System.out.println("입력한 비번: " + password);
		System.out.println("가입 당시 생성한 비번: " + kim.pw);
		
		System.out.println("-------------------------------");
		
		System.out.println("== 연산자의 결과: " + (password == kim.pw));
		System.out.println("equals의 결과: " + (password.equals(kim.pw)));

	}

}
