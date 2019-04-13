package org.ismek.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetCollectionProgram {

	public static void main(String[] args) {
		HashSet set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		set.add(3);
		for (Object object : set) {
			System.out.println(object);
		}
		
		HashSet set2 = new HashSet<>();
		set2.add("A");
		set2.add("B");
		set2.add("C");
		set2.add("A");
		set2.add("D");
		for (Object object : set2) {
			System.out.println(object);
		}
	}
}
