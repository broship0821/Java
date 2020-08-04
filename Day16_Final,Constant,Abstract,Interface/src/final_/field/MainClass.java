package final_.field;

public class MainClass {

	public static void main(String[] args) {

		Person kim = new Person("김철수");
//		kim.nation = "미국";
//		kim.name = "김마이클";
		//final 변수는 변경 불가
		kim.age = 30;
		
		Person park = new Person("박영희");
//		park.nation = "중국";
//		park.name = "박중국";
		park.age = 20;

	}

}
