package collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx3 {

	public static void main(String[] args) {
		String[] data = {"A", "B", "A", "B", "D", "B", "A", "B", "B", "B", "C", "D"};
		
		HashMap map = new HashMap();
		
		for(int i=0;i<data.length;i++) {
			if(map.containsKey(data[i])) {
				int value = (int)map.get(data[i]);
				map.put(data[i], value+1);
			} else {
				map.put(data[i], 1);
			}
		}
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = (int)entry.getValue();
			System.out.println(entry.getKey()+ " : " + printBar('#', value) + " " + value);
		}
	
	}

	private static Object printBar(char c, int value) {
		// TODO Auto-generated method stub
		return null;
	}
}
