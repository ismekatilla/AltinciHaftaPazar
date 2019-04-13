package org.ismek.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapCollectionProgram {

	public static void main(String[] args) {
		
		LinkedHashMap map = new LinkedHashMap();
		map.put("ALİ", 1);
		map.put("VELİ", 2);
		map.put("VELİ", 3);
		map.put("AHMET", 4);
		map.put("AYŞE", 4);
		for (Object object : map.keySet()) {
			String deger = map.get(object).toString();
			System.out.println(object + "--" + deger);
		}
	}
}
