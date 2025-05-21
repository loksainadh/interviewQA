import java.util.Arrays;

public class Jothi {

    public static int m1(int[] a,int[] b) {
         int i=0, j=0, k=0;
        int n = a.length;
        int m = b.length;
       int[] result=new int[n+m];
       while(i<n && j<m){
           if (a[i]<b[j])
           {
              result[k++]=a[i++] ;
           }
           else
           {
               result[k++]=b[j++];
           }
        }
       System.out.println("fist while "+Arrays.toString(result));
       while (i<n)
       {
           result[k++]=a[i++];
       }
       while (j<m)
       {
           result[k++]=b[j++] ;
       }
       System.out.println(Arrays.toString(result));
       int length = result.length ;
       if(length%2==1)
       {
           return result[length/2] ;
       }
       else {
           return (result[length / 2] + result[length / 2 - 1]) / 2;
       }

    }

    public static void main(String[] args) {


        int[]  a={5,6,7,8};

        int[] b ={2,3,4};

        int v = m1(a, b);

        System.out.println(v);



    }



}
