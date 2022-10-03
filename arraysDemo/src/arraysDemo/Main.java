package arraysDemo;

public class Main {

	public static void main(String[] args) {

		String ogrenci1 = "Zeynep";
		String ogrenci2 = "Elif";
		String ogrenci3 = "Ali";
		String ogrenci4 = "Sefa";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("--------------------------");

		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Zeynep";
		ogrenciler[1] = "Ali";
		ogrenciler[2] = "Elif";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		System.out.println("--------------------------");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
