package miniProjeAsalSay�;

public class Main {

	public static void main(String[] args) {
		int num = 29;
        boolean prime = true;


        if (num < 1){
            System.out.println("Ba�ka bir say� giriniz...");
            return;
        }
        else if (num == 1){
            System.out.println("Say� asal de�ildir.");
            return;
        }
        for (int i=2; i<num;i++){
            if(num%i ==0){
                prime= false;
            }
        }
        if(prime){
            System.out.println("Say� asald�r.");
        } else{
            System.out.println("Say� asal de�ildir.");
        }

	}

}
