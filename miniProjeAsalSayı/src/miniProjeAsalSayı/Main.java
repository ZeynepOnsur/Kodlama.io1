package miniProjeAsalSayı;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// Kendi çözümüm :))
		
		int sayi = 3;
		int sonuc = 0;
		
		if (sayi == 1) {
			System.out.println("Sayı asal değildir.");
		}

		if (sayi < 1) {
			System.out.println("Geçersiz sayı");
		
		for (int i = 1; i < 38; i++) {
			i++;
			
		if (sayi / i == sonuc) {
				System.out.println("asal sayı değil");
			}

		}

		// Engin Hoca ile çözdüğüm
		int number = 29;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Sayı asal değildir.");
		}

		if (number < 1) {
			System.out.println("Geçersiz sayı");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println("Sayı asaldır.");
		} else {
			System.out.println("Sayı asal değildir.");
		}

	}
	}
	
}

