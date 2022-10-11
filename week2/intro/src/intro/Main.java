package intro;

public class Main {
	// Main Java'da baþlangýç noktasý
	public static void main(String[] args) {
		System.out.println("phoenix"); //sys ctrl space
		
		// Deðiþken isimlendirilmeleri Java'da camelCase yazýlýr
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
		//{} içindeki bilgiler (DB) DataBase'den gelir
		String[] krediler = {"Hýzlý Kredi","Maaþýný HalkBank'tan Alanlar","Mutlu Emekli"};
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}
}