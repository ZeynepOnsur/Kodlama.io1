package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		int enBuyukSayi = sayi1;
		
		if (enBuyukSayi<sayi2) {
			
			enBuyukSayi=sayi2;
		
		}else if(enBuyukSayi<sayi3) {
		
			enBuyukSayi=sayi3;
		
		}else {
		
			enBuyukSayi=sayi1;
		}
		
		System.out.println(enBuyukSayi);
		

	}

}
