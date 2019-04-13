package org.ismek.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollectionProgram {

	public static void main(String[] args) {
		
		LinkedList siraliListe = new LinkedList();
		siraliListe.add("ABCD");
		siraliListe.add("TERESA");
		siraliListe.add("DEFG");
		for (Object object : siraliListe) {
			System.out.println(object);
			Object element = siraliListe.element();
		}
		
		Iterator iterator = siraliListe.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}
}
