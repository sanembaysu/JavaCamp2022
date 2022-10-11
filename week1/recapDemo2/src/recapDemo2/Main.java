package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {2.8,1.3,4.7,5.2};
        double total=0;
        double max = myList[0];
        for(double num:myList){
            if(max<num){
                max=num;
            }
            total += num;
            System.out.println(num);
        }
        System.out.println("Toplam : " + total);
        System.out.println("En büyük : "+ max);
	}

}
