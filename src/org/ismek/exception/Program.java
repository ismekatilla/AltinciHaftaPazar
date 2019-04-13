package org.ismek.exception;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		String okunanSayi = null;
		for (int i = 0; i < 3; i++) {
			try {
				// alacağım değer 324i olsun
				okunanSayi = scanner.next();
				int donusturulmusSayi = Integer.parseInt(okunanSayi);
				System.out.println(donusturulmusSayi);
			} catch (NumberFormatException | IllegalStateException e) {
				if (e instanceof IllegalStateException) {
					System.out.println("Illegal hatası"); 
				} else if (e instanceof NumberFormatException) {
					System.out.println("Number hatası");
				}
				// Burada 324 gelmesini bekliyoruz
				String parcasiAlinmisString = okunanSayi.substring(0, i);
				int yeniDonusturulmusSayi = Integer.parseInt(parcasiAlinmisString);
				System.out.println(yeniDonusturulmusSayi);
			} finally {
				scanner.close();
				System.out.println("Bu blok her ihtimalde çalışır.");
			}
		}

		System.out.println("asdfasd");
	}
}
