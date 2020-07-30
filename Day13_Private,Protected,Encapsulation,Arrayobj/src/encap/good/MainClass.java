package encap.good;

public class MainClass {

	public static void main(String[] args) {

		MyBirth my = new MyBirth();
		
//		my.year = -1230; //private 됨
//		my.setDay(-1230);
		my.setDay(-30);
		my.setMonth(70);
		my.setYear(19999);
		my.birthInfo();

	}

}
