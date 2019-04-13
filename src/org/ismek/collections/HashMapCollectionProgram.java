package org.ismek.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapCollectionProgram {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("ALİ", 1);
		map.put("VELİ", 2);
		map.put("VELİ", 3);
		map.put("AHMET", 4);
		map.put("AYŞE", 4);
		for (Object object : map.keySet()) {
			String deger = map.get(object).toString();
			System.out.println(object + "--" + deger);
		}
		
		
		Ogrenci ogrenci1 = new Ogrenci("Ali", 1);
		Ogrenci ogrenci2 = new Ogrenci("Veli", 2);
		Ogrenci ogrenci3 = new Ogrenci("Ahmet", 3);
		ArrayList<Ogrenci> liste1 = new ArrayList<Ogrenci>();
		liste1.add(ogrenci1);
		liste1.add(ogrenci2);
		liste1.add(ogrenci3);
		
		Ogrenci ogrenci4 = new Ogrenci("Ayşe", 4);
		Ogrenci ogrenci5 = new Ogrenci("Fatma", 5);
		ArrayList<Ogrenci> liste2 = new ArrayList<Ogrenci>();
		liste2.add(ogrenci4);
		liste2.add(ogrenci5);
		
		HashMap<Integer, ArrayList<Ogrenci>> ogrenciMap = new HashMap<Integer, ArrayList<Ogrenci>>();
		ogrenciMap.put(1, liste1);
		ogrenciMap.put(2, liste2);
		
		for (Integer sinifNumarasi : ogrenciMap.keySet()) {
			System.out.println(sinifNumarasi + ". sınıfın öğrencileri");
			ArrayList<Ogrenci> ogrenciListesi = ogrenciMap.get(sinifNumarasi);
			for (Ogrenci ogrenci : ogrenciListesi) {
				System.out.println(ogrenci);
			}
		}
		
	}
}
