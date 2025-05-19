public class ReverseVowelsOnly {

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            //first loop to incriment the left side
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            //second  loop for ittarating this one
            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            // Swap vowels logic hear need to devlop
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
// cheching method for vovels
    private static boolean isVowel(char ch) {

        return "aeiouAEIOU".indexOf(ch)!=-1;
    }

    public static void main(String[] args) {
        String input = "loksainadh";
        String result = reverseVowels(input);
        System.out.println("Reversed vowels only: " + result);
    }
}
