
public class PenMain {

	public static void main(String[] args) {
		
		//펜의 기능과 속성들을 사용하려면 설계도(class)를
		//바탕으로 객체를 생성해야됨
		
		//객체 생성 문법: 클래스타입 변수명 = new 클래스이름();
		Pen redPen = new Pen();
		
		//참조 연산자(.)를 통해 객체의 속성과 기능을 사용할 수 있음
		redPen.color = "빨강";
		redPen.price = 500;
		
		Pen bluePen = new Pen();
		bluePen.color = "파랑";
		bluePen.price = 600;
		
		redPen.write();
		bluePen.write(); 
		redPen.priceInfo();
		bluePen.priceInfo();
		
		//서로 주소값이 다름 
		System.out.println(redPen);
		System.out.println(bluePen);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
