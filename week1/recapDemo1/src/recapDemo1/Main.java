package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int num1 = 27;
        int num2 = 13;
        int num3 = 84;
        int max = num1;

        if(max<num2){
            max = num2;
        }
        else if(max<num3){
            max = num3;
        }
        System.out.println("En büyük sayý : "+ max);
	}

}
