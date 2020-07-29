package modi.cls.pac1;

//public 제한자는 접근 제한 자체가 없는 형태(어디에서나 사용 가능)
public class B {

	//클래스 A의 접근 제한자가 패키지 프랜들리기 때문에
	//동일 패키지 내부에서는 접근 가능
	A a = new A(); //같은 패키지라 A에 접근 가능
}
