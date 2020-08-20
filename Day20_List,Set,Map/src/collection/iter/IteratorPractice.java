package collection.iter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorPractice {

	public static void main(String[] args) {
		
		Collection list = new ArrayList();
//		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		System.out.println("------------------------------");
		
		//iterator는 1회용이라 다쓰고 나면 다시 얻어와야됨
		it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		System.out.println("------------------------------");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//for문도 똑같이 구현할 수 있으나
		//list가 set으로 바뀌면 코드를 수정해야됨
		//iterator는 코드 수정 안해도됨(같은 collection 클래스기 때문에)
		
		//map 에는 iterator가 없음 keySet(), entrySet(), values()같은걸 이용해서 list나 set으로 바꾼후 사용 가능

	}

}
