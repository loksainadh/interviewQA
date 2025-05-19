import java.util.Arrays;

public class Squresinteger {
    public static void main(String[] args) {

        String input = "1,2,3,4,5,6,90,27,99";


      String [] ss= input.split(",");

        int e = Arrays.stream(ss).mapToInt(Integer::parseInt).map(i -> i * i).sum();
          System.out.println(e);

          while(e>=10){
              int sum=0;
              while (e>0){

                 sum = sum +e % 10;//this for take give last number
                     e=e/10;// this for remove last number

              }
              e=sum;
              System.out.println(sum);

          }


         }

    }






