package final_.constant;

public class Earth {

	/*
	 상수(constant)
	 
	 상수는 고정된 불변의 값입니다.(static + final) 따라서 어디에서 접근을 하더라도
	 같은 값이 나와야 하며, 값의 변경도 불가능함.
	 
	 따라서, 자바에서는 상수를 선언할 때 static과 final을 동시에 사용함
	 */
	
	static final double RADIUS = 6400; //상수는 대문자로 쓰는 것이 관례
	
	static final double SURFACE_AREA;
	//상수는 생성자로 초기화 안되기 때문에 초기화자를 통해 초기화 시켜야됨
	static {
		SURFACE_AREA = RADIUS * RADIUS * 4 * Math.PI;
	}
	
}
