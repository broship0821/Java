package modi.constructor.pac2;

import modi.constructor.pac1.A;

public class C {

	A a1 = new A(true); //public
	//둘다 안됨
//	A a2 = new A(1); //패키지 프랜들리
//	A a3 = new A(3.14); //private
}
