import java.util.Arrays;

public class Copythearraylist {


    public static void main(String[] args) {

        int[] a = {2, 3, 4, 5, 6, 7};
        int[] b = new int[a.length];

         int i=0;
        int j = 0;

        while(i<b.length){

            b[j++]=a[i++];
        }

        //Arrays.asList(b).stream().forEach(i->System.out.println(i.toString()));

        for (int l = 0; l < b.length; l++) {
System.out.println(b[l]);
        }
    }
}