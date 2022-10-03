package sayiBulma;

public class Main {

	public static void main(String[] args) {
		//Benim çözümüm
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 2;

		for (int sayi : sayilar) {
			if(sayi==aranacak) {
				System.out.println("Buldum aradığın sayı : " + sayi);
			}
		}
		
		//Engin hoca ile çözdüğüm
		
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int bulunacak = 2;
		boolean varMı = false;
		
		for (int number : numbers) {
			if(number==bulunacak) {
				varMı = true;
				break;
			}
			
		}
	
		if(varMı) {
			System.out.println("Sayı mevcuttur.");
		}else {
			System.out.println("Sayı mevcut değildir.");
		}
	
	
	
	
	
	}

}
