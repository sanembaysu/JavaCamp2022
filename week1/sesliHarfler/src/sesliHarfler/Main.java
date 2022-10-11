package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char character = 'A';

        switch(character){
            case 'E':
            case 'Ý':
            case 'Ö':
            case 'Ü':
                System.out.println("Ýnce sesli harf.");
            default:
            System.out.println("Kalýn sesli harf.");
        }
	}

}
