import java.sql.SQLOutput;

public class Jothiclass {

    public static void main(String[] args) {

        for(int i=0;i<2;i++) {
            for (int j = 0; j <= 2; j++) {
                if (j == 1) {
                    continue;
                } else {
                    System.out.println("j value " + j);
                }
                System.out.println("inside second for loop " + j);
            }
            System.out.println("After second forloop "+i);
        }





    }



}
