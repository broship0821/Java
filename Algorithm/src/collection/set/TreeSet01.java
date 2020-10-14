package collection.set;

import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80, 68, 39, 56, 74, 69, 83, 92, 28, 82};
		
		for(int i=0;i<score.length;i++)
			set.add(score[i]);
		
		System.out.println("set: " + set);
		System.out.println("50보다 큰값: " + set.headSet(50));
		System.out.println("50보다 작은값: " + set.tailSet(50));
		System.out.println("40~70사이: " + set.subSet(40, 70));

	}

}
