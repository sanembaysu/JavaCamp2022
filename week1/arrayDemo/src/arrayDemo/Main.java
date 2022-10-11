package arrayDemo;

public class Main {

	public static void main(String[] args) {
		String stu1 =  "Sanem";
        String stu2 =  "Engin";
        String stu3 =  "Derin";
        String stu4 =  "Ege";
        
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);
        System.out.println(stu4);

        System.out.println("-----------------");


        String[] students = new String[3];
        students[0] = "Sanem";
        students[1] = "Derin";
        students[2] = "Ege";
        
        for(int i=0;i<students.length;i++ ){
            System.out.println(students[i]);
        }

        System.out.println("-----------------");
        
        for (String stu:students){
            System.out.println(stu);
        }

	}

}
