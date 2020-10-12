package collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class HashSet04 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A = " + setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B = " + setB);
		
		HashSet hab = new HashSet();
		HashSet kyo = new HashSet();
		HashSet cha = new HashSet();
		
		//교집합 구하기(retainAll() 써도됨)
		Iterator it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setB.contains(tmp))
				kyo.add(tmp);
		}
		
		//합집합 구하기(addAll() 써도됨)
		it = setA.iterator();
		while(it.hasNext()) {
			hab.add(it.next());
		}
		
		it = setB.iterator();
		while(it.hasNext()) {
			hab.add(it.next());
		}
		
		//차집합 구하기(removeAll()써도됨)
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				cha.add(tmp);
		}
		
		System.out.println("A ∩ B = " + kyo);
		System.out.println("A ∪ B = " + hab);
		System.out.println("A - B = " + cha);

	}

}
