import javax.swing.*;
import java.util.Arrays;

public class Reverceonleyalfabets {

    public static void main(String[] args) {
        // input: Lo@ks#ai
        // output:  ia@sk#oL

        String s = "Lo@ks#ai";

        String s1 = reverseString(s);

        System.out.println(s1);

        System.out.println(reverseString("^^asasdf%$#"));
        System.out.println(reverseString(""));
        System.out.println(reverseString(" "));

       /* for (int i=ss.length-1;i>=0;i--){
            if(Character.isLetter(ss[i])) {
                System.out.print(ss[i]);
            }else{
                System.out.print(ss[i]);
            }

        }*/


    }

    public static String reverseString(String s) {
        char[] ss = s.toCharArray(); //L o @ k s # a i

        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (!Character.isLetter(ss[left]) && !Character.isLetter(ss[right])) {
                left++;
                right--;
            } else {
                char temp = ss[left];
                ss[left] = ss[right];
                ss[right] = temp;
                //i o @ k s # a L
            }
            left++;
            right--;
        }

        System.out.println(Arrays.toString(ss));

        return new String(ss);

    }


}
