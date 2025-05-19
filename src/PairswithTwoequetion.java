import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PairswithTwoequetion {
    Set<Integer> s =new HashSet<Integer>();
       public int m1(int[] a){

          int count =0;
          for (int i=0;i<a.length-1;i++){
              int temp=a[i]*2;
           for(int j=0;j<a.length-1;j++){
               if(temp==a[j]){
                   count ++;
                    s.add(a[i]);
                    s.add(a[j]);

                  // System.out.println(a[i]);
                  // System.out.println(a[j]);



               }

           }


          }

          s.stream().forEach(i->{
              if(i%2==0){
                  System.out.print("odd group"+ "   "+i);
              }
              System.out.print("evengroup"+"   "+i);
          });


           return count;

       }



    public static void main(String[] args) {
        int[] numbers = {8, 6, 5, 2, 9, 3,4, 24};
        PairswithTwoequetion b= new PairswithTwoequetion();
        int ss=b.m1(numbers);
   System.out.println(ss);









    }










}
