
public class Identifier {

	public static void main(String[] args) {

		//꼭 지켜야할 규칙
		// 1. 식별자의 이름은 중복을 허용하지 않음
		// 그리고 대소문자를 철저하게 구분
		int age = 35;
//		int age = 40; //Error
		int Age = 45; //가능

		System.out.println(age);
		System.out.println(Age);
		
		// 2. 식별자 이름은 숫자로 지정하거나 숫자로 시작하면 안됨
//		int 700 = 365; //Error
//		int 7number = 7; //Error syntax error
		int number7 = 7;
		int num7ber = 7;
		
		// 3. 식별자 이름에 공백을 포함할 수 없음
//		int my birth day = 19921013; // 공백 전후로 각각의 변수로 인식하기 때문
		int myBirthDay = 19921013; //카멜케이스 표기법
		
		// 4. 식별자 이름에 쓸수 있는 특수문자는 _, $만 사용가능
		// 하지만 사용 권장하지 않음
		String $hello_ = "안녕";
		
		// 5. 키워드(예약어)는 식별자 이름으로 지정 불가
//		String class = "클래스" //키워드는 자동으로 보라색 표시됨
		String Class = "클래스"; //대문자로 하면 사용은 가능하나 권장하지 않음
		String className = "클래스"; // 차라리 이렇게 쓰는게 나음
		
		// 6. 한글이나 한자 같은 식별자 이름도 지정이 가능
		// 그러나 사용 권장하지 않음
		String 한글 = "한글";
		String 名 = "홍길동";
		System.out.println(한글);
		System.out.println(名);
		
		
		
		
	}

}
