import java.util.ArrayList;
import java.util.List;

public class Findthedupicatesinarray {


    public static void main(String[] args) {
        int[] a = {1,3,4,6,4,5};
        for (int i = 0; i < a.length; i++) {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("duplicate number :: "+a[i]);
                    break;
                }
            }


        }


    }


}
