package intro;

public class Main {
	// Main Java'da ba�lang�� noktas�
	public static void main(String[] args) {
		System.out.println("phoenix"); //sys ctrl space
		
		// De�i�ken isimlendirilmeleri Java'da camelCase yaz�l�r
		String ortaMetin = "Takma Ad";
		System.out.println(ortaMetin);
		
		// integer
		int vade=5;
		System.out.println(vade);
		
		double dolarDun = 18.14;
		double dolarBugun = 18.10;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) { //true
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun){
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		// array
		//{} i�indeki bilgiler (DB) DataBase'den gelir
		String[] krediler = {"H�zl� Kredi","Maa��n� HalkBank'tan Alanlar","Mutlu Emekli"};
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}
}