package org.ismek.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SortedSetCollectionProgram {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(4);
		set.add(5);
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		set.add(3);
		for (Object object : set) {
			System.out.println(object);
		}
	}
}
