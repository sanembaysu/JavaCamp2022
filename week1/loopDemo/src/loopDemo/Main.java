package loopDemo;

public class Main {

	public static void main(String[] args) {
		/// for
        for(int i=6;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("For döngüsü sona erdi.");
    
        /// while
        int j = 3;
        while(j<=12){
            System.out.println(j);
            j += 3;
        }
        System.out.println("While döngüsü sona erdi.");

        /// do while
        int k = 16;
        do{
            System.out.println(k);
            k +=4;
        } while(k<=32);
            System.out.println("Do While döngüsü sona erdi.");
	}

}
