package collection.generic;

import java.util.ArrayList;

class Fruit2 {
	public String toString() { return "Fruit"; }
}
class Apple2 extends Fruit2	 { public String toString() { return "Apple"; } }
class Grape2 extends Fruit2 { public String toString() { return "Grape"; } }

class Juice {
	String name;

	public Juice(String name) {
		this.name = name + "Juice";
	}

	@Override
	public String toString() {
		return "Juice [name=" + name + "]";
	}
	
}

class Juicer {
	static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
		String tmp = "";
		
		for(Fruit2 f : box.getList())
			tmp += f + " ";
		
		return new Juice(tmp);
	}
}

public class GenericWildCard {

	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox = new FruitBox2<>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));

	}

}

class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>(); //item을 저장할 list
	void add(T item) { list.add(item); } //박스에 item을 추가
	T get(int i) { return list.get(i); } //박스에서 item을 꺼낼때
	
	ArrayList<T> getList() { return list; }
	
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
}