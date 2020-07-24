
public class PhoneMain {

	public static void main(String[] args) {

		Phone basic = new Phone();
//		basic.model = "폴더폰";
//		basic.color = "회색";
//		basic.price = 200000;
		basic.showSpec();
		
		Phone galaxyS20 = new Phone("S20");
		galaxyS20.showSpec();
		
		Phone iPhone11 = new Phone("아이폰11", "화이트");
		iPhone11.showSpec();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
