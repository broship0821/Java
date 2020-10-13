package collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSet02 {

	public static void main(String[] args) {
//		Set set = new HashSet();
		TreeSet set = new TreeSet(); //트리셋 사용하면 처음부터 정렬되어짐
		
		for(int i=0;set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		
		System.out.println("정렬전: " + set);
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println("정렬후: " + list);

	}

}
