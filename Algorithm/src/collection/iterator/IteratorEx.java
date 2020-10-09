package collection.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class IteratorEx {

	public static void main(String[] args) {
		Collection c = new TreeSet();
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");
		
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("---");
		//다시 사용하려면 iterator를 다시 앞으로 땡겨와야됨
		it = c.iterator();
		while(it.hasNext()) {
			Object something = it.next();
			System.out.println(something);
		}
		
	}

}
