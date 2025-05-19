public class ReverseStringSwap {

    public static String reverse(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            char t = chars[left];
            chars[left] = chars[right];
            chars[right] = t;
            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "loksainadh";
        String reversed = reverse(s);
        System.out.println("Reversed string: " + reversed);
    }
}
