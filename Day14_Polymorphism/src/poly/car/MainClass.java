package poly.car;

public class MainClass {

	public static void main(String[] args) {


		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();
		
		Morning m1 = new Morning();
		Morning m2 = new Morning();
		Morning m3 = new Morning();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Tesla t4 = new Tesla();
		
//		s1.run();s2.run();..... 원래는 이렇게 일일이 불러줘야됨
		
		//배열에 객체 넣기
//		Sonata[] sonatas = {s1,s2,s3};
//		for(Sonata s : sonatas) {
//			s.run();
//		}
		//배열은 동종 객체만 넣을 수 있기 때문에 다른 클래스 타입의 객체는 집어 넣을 수 없음
		
		Car[] cars = {s1,s2,s3,m1,m2,m3,t1,t2,t3,t4};
		for(Car c : cars) {
			c.run();
		}
		
		System.out.println("----------------------------");
		
		s1.frontLeft = new Ntire();
		s1.frontRight = new Ntire();
		s1.rearLeft = new Ntire();
		s1.rearRight = new Ntire();
		
		
		
		Driver kim = new Driver();
		kim.drive(s1);
		kim.drive(m1);
		kim.drive(t1);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
