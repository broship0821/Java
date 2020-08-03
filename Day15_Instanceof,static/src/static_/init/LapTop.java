package static_.init;

public class LapTop {

	public static String company;
	public static String model;
	public static String info;
	public int price;
	
	//정적 변수를 자동으로 초기화 하려면 정적 초기화자 사용
	static {
		System.out.println("정적 초기화자 호출");
		company = "LG";
		model = "Gram";
		info = company + "-" + model;
//		price = 1000000; 여기는 static 변수만 들어올 수 있음
	}
	
	public LapTop() {
		//그냥 생성자 안에는 static, non-static 다 들어올 수 있음
		System.out.println("생성자 호출");
		company = "LG";
		model = "Gram";
		info = company + "-" + model;
		price = 1000000;
	}
	
	
}
