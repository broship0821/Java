package collection.generic;

import java.util.ArrayList;
import java.util.List;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

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
		
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
//		ArrayList<Product> tvList = new ArrayList<Tv>(); //지네릭 타입은 무조건 같아야됨, 부모자식 관계도 안됨
//		List<Tv> tvList = new ArrayList<Tv>(); //지네릭 타입만 같다면 다형성도 OK

		//Product와 그 자식들은 허용
		productList.add(new Tv());
		productList.add(new Audio());
		
		//Tv와 그 자식들 허용, Audio와는 아무 관계 없어서 안됨
		tvList.add(new Tv());
//		tvList.add(new Audio()); //
		
		printAll(productList);
//		printAll(tvList); //printAll 메소드에는 ArrayList<Product>타입의 형식만 가능
		
		
		
		
	}

	private static void printAll(ArrayList<Product> list) {
		for(Product p : list)
			System.out.println(p);
		
	}

}
