import java.util.Stack;

public class BracketChecker {

    public static boolean m1(String s) {
        Stack<Character> dd = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                dd.push(ch);
            } else if (ch == ')') {
                if (dd.isEmpty()) {
                    return false;
                }

                char top = dd.peek();

               if (top != '(') {
                    return false;
                }
            else  {
                dd.pop();
            }// Only pop if matched
            } else {
                // Optional: handle invalid characters if needed
                return false;
            }
        }

        // Final check: stack should be empty if all brackets matched
        return dd.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(())"; // Try also "()", "(())", "())"

        boolean result = m1(s);

        System.out.println("Is the string valid? " + result);
    }
}
