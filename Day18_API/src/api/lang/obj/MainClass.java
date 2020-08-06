package api.lang.obj;

public class MainClass {

	public static void main(String[] args) {

		Person hong = new Person("홍길동", 25, "남자");
		Person park = new Person("박영희", 25, "여자");
		
//		hong.personInfo();
//		park.personInfo();
		
		
//		String a = "AAA";
//		
//		System.out.println(hong); //주소가 나옴
//		System.out.println(a); //객체 자체가 나옴
//		
//		System.out.println(hong.toString()); //.toString()이게 자동으로 붙여짐
//		System.out.println(hong.personInfo()); //이렇게 기본설정을 바꾸고 싶음
		
		System.out.println(hong);
		System.out.println(park);
		
		if(hong.equals(park)) {
			System.out.println("나이가 같습니다.");
		}
		else {
			System.out.println("나이가 다릅니다.");
		}

	}

}
