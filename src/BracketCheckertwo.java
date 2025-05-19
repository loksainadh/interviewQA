import java.util.Stack;

public class BracketCheckertwo {

    public static boolean m1(String s) {
        Stack<Character> dd = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '('||ch=='{'||ch=='[') {
                dd.push(ch);
            } else if (ch == ')'||ch == '}'||ch == ']') {
                if (dd.isEmpty()) {
                    return false;
                } else {
                    dd.pop(); // pop matched '('
                }
            } else {
                // Invalid character
                return false;
            }
        }

        // All brackets must be matched
        return dd.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{(()[)]}";
        boolean result = m1(s);
        System.out.println("Is the string valid? " + result);
    }
}
