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
		FruitBox<? extends Fruit> fbox =(FruitBox<? extends Fruit>) new FruitBox<Fruit>();
		FruitBox<? extends Fruit> abox = new FruitBox<Apple>();

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