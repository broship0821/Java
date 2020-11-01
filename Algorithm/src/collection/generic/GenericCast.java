package collection.generic;

import java.util.ArrayList;

class Fruit implements Estable {
	public String toString() { return "Fruit"; }
}
class Apple extends Fruit	 { public String toString() { return "Apple"; } }
class Grape extends Fruit { public String toString() { return "Grape"; } }
class Toy 						 { public String toString() { return "Toy"; } }

interface Estable {}

public class GenericCast {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
//		FruitBox<Grape> grapeBox = new FruitBox<>(); //타입 불일치
		Box<Toy> toyBox = new Box<>(); //얘는 제약이 없기 때문에 OK
//		FruitBox<Toy> toyBox2 = new FruitBox<>(); //Fruit랑 그 자손만 가능

	}

}

class FruitBox<T extends Fruit & Estable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>(); //item을 저장할 list
	void add(T item) { list.add(item); } //박스에 item을 추가
	T get(int i) { return list.get(i); } //박스에서 item을 꺼낼때
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
}