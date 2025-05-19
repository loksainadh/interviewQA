import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";
        char result = firstNonRepeatingChar(str);
        
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char firstNonRepeatingChar(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();


        for (int i = 0; i < str.length(); i++) {
            charCount.put(str.charAt(i), charCount.getOrDefault(str.charAt(i), 0) + 1);
        }


        for (int i = 0; i < str.length(); i++) {
            if (charCount.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }
}
