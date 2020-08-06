package api.lang.string;

import java.util.Scanner;

public class StringQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요: ");
		String ssn = sc.next();
		
		//문자열 -> 정수
		//int 변수 = Integer.parseInt("문자열");
		
		String year = ssn.substring(0, 2);
		String month = ssn.substring(2, 4);
		String day = ssn.substring(4, 6);
		String gender = ssn.substring(7, 8);
		
		if(gender.equals("1") || gender.equals("2")) {
			if(gender.equals("1")) {
				gender = "남자";
			}
			else {
				gender = "여자";
			}
			year = "19" + year;
		}
		else if(gender.equals("3") || gender.equals("4")) {
			if(gender.equals("3")) {
				gender = "남자";
			}
			else {
				gender = "여자";
			}
			year = "20" + year;
		}
		
		int age = Integer.parseInt(year) + 1;
		age = 2020 - age;
		System.out.printf("%s년 %s월 %s일 %d세 %s", year, month, day, age, gender);
		
		sc.close();
	}

}
