package org.ismek.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollectionProgram {

	public static void main(String[] args) {
		
		Ogrenci ogrenci = new Ogrenci("AHMET", 5556);
		
		ArrayList liste = new ArrayList();
		liste.add(5);
		liste.add("ALİ");
		liste.add(33.45);
		liste.add(ogrenci);
		
		for (Object object : liste) {
			System.out.println(object.toString());
		}
		
		for (int i = 0; i < liste.size(); i++) {
			if (i == 1) {
				liste.remove(1);
			}
			Object object = liste.get(i);
			System.out.println(object);
		}
		
		
		ArrayList<String> stringListe = new ArrayList<>();
		stringListe.add("ALİ");
		stringListe.add("VELİ");
		for (String string : stringListe) {
			System.out.println(string);
		}

		Iterator<String> iterator = stringListe.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			
			if (string.equals("VELİ")) {
				iterator.remove();
				break;
			}
			System.out.println(string);
		}
		
		System.out.println("*********************");
		ArrayList<String> strList = new ArrayList<String>();
		strList.addAll(liste);
		for (Object string : strList) {
			System.out.println(string);
		}
		
	}
}