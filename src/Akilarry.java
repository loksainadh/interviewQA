import java.util.*;
import java.util.stream.Collectors;

public class Akilarry {

    public static void main(String[] args) {
        int[] d= {1,6,6,655,58,100,100,200,100,200,500,50,50,200,500};
                 Set <Integer> ee= new TreeSet<>(Collections.reverseOrder());

      //  Optional<Integer> ss = Arrays.stream(d).boxed().collect(Collectors.toSet()).stream().sorted(Comparator.reverseOrder()).skip(2).findFirst();
        //   System.out.println(ss);
for(int  arr:d){
    ee.add(arr);
}

int count =0;
for(Integer su:ee){
if(count ==2) {
    System.out.println(su);
}
count++;
         }





        }


















    }








