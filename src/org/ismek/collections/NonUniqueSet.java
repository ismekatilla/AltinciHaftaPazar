package org.ismek.collections;

import java.util.HashSet;

public class NonUniqueSet {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("ALİ", 1);
		Ogrenci ogrenci2 = new Ogrenci("ALİ", 1);
		
		HashSet set = new HashSet();
		set.add(ogrenci1);
		set.add(ogrenci2);
		
		for (Object object : set) {
			System.out.println(object);
		}
	}
}
