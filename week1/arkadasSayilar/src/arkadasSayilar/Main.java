package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		int num1 = 220;
        int num2 = 284;
        int total1 = 0;
        int total2 = 0;

        for (int i=1;i<num1;i++) {
            if (num1%i==0) {
                total1 +=i;
            }
        }
        for (int i=1;i<num1;i++) {
            if (num2%i==0) {
                total2 +=i;
            }
        }

        if (num1==total2 && num2==total1) {
            System.out.println("�ki say� arkada�t�r");
        }
        else{
            System.out.println("�ki say� arkada� de�ildir");

        }
	}

}
