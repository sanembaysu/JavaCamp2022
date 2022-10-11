package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int numbers[] = new int[]{1,2,5,7,9,0};
        int search = 4;
        boolean varMi = false;

        for (int num : numbers){
            if(num==search){
                varMi=true;
                break;

            }
        }
        if(varMi){
            System.out.println("Sayý mevcuttur.");
		}else {
			System.out.println("Sayý mevcut deðildir.");
        }
	}

}
