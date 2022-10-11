package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] city = new String[3][3];

        city[0][0] = "Ýstanbul";
        city[0][1] = "Bursa";
        city[0][2] = "Bilecik";
        city[1][0] = "Ankara";
        city[1][1] = "Konya";
        city[1][2] = "Kayseri";
        city[2][0] = "Diyarbakýr";
        city[2][1] = "Þanlýurfa";
        city[2][2] = "Gaziantep";

        for(int i=0;i<3;i++){
            System.out.println("----------------------");
            for(int j=0;j<3;j++){
                System.out.println(city[i][j]);
            }
        }
	}

}
