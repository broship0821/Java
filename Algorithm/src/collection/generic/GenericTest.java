package collection.generic;

import java.util.ArrayList;

class Tv {}
class Audio {}

public class GenericTest {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		ArrayList<Tv> list = new ArrayList<Tv>(); //Tv타입 객체만 저장 가능
		
		list.add(new Tv());
//		list.add(new Audio());
		
		Tv t = list.get(0);
		/*
		 제네닉스가 없었다면 무조건 Object여서 형변환 필요
		 지금은 Tv만 들어가기에 형 변환할 필요 없어짐
		 */

	}

}
