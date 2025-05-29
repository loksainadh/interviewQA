public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (but not 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        
        int x = 121;
        System.out.println("Is " + x + " a palindrome? " + p.isPalindrome(x)); // Output: true
    }
}
