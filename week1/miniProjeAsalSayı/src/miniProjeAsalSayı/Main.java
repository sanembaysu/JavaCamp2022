package miniProjeAsalSayý;

public class Main {

	public static void main(String[] args) {
		int num = 29;
        boolean prime = true;


        if (num < 1){
            System.out.println("Baþka bir sayý giriniz...");
            return;
        }
        else if (num == 1){
            System.out.println("Sayý asal deðildir.");
            return;
        }
        for (int i=2; i<num;i++){
            if(num%i ==0){
                prime= false;
            }
        }
        if(prime){
            System.out.println("Sayý asaldýr.");
        } else{
            System.out.println("Sayý asal deðildir.");
        }

	}

}
