package obj.array;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {

		/*
		 1. Person 객체를 생성하기 위해 필요한 회원 정보를
		 스캐너를 통해 입력받기(이름,나이,성별)
		 
		 2. 입력받은 정보를 토대로 Person 객체 생성
		 
		 3. 입력은 배열의 크기만큼 받기
		 배열크기는 100
		 
		 4. 사용자가 이름을 작성하는 란에 "그만" 이라고 입력시
		 입력을 종료하고 반복문 종료시키기
		 
		 5. 입력받은 정보를 토대로 만들어진 Person객체를 배열에 보관하기
		 배열이 가득 차거나 입력이 종료되면 생성한 객체들의 personInfo()를
		 반복문을 이용해서 출력하기
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Person[] people = new Person[100];
		
		//for문
		for(int i=0;i<people.length;i++) {
			System.out.println("*** 회원 정보 입력 ***");
			System.out.print("이름: ");
			String name = sc.next();
			if(name.equals("그만")) {
				System.out.println("입력을 중지합니다.");
				break;
			}
			System.out.print("나이: ");
			int age = sc.nextInt();
			System.out.print("성별: ");
			String gender = sc.next();
			System.out.println("회원 정보 입력 성공!");
			System.out.println("-------------------");
			
			people[i] = new Person(name, age, gender);
//			people[i].setName(name);
//			people[i].setAge(age);
//			people[i].setGender(gender);
			//객체 배열은 2번 생성해야됨, 생성 후 setter 통해 입력 가능
		}
		
		System.out.println("\n\n*** 회원 정보 ***");
		
		for(Person p : people) {
			if(p==null) {
				break;
			} //중간에 "그만"으로 종료되었을 경우 나머지 배열은 null이 들어감, 그럼 생성조차 안되었기 때문에 출력 불가
			p.personInfo();
			System.out.println("-------------------");
		}
		
		sc.close();
		
		
		
		
		
		
		
		

	}

}
