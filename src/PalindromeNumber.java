public class PalindromeNumber {

    public static boolean isPalindrome(int number) {
        int original = number;  // Store the original number
        int reversed = 0;  // Initialize the reversed number to 0
// best opproch i have tryed even we can go for more by
        // Reverse the number just reffrence for swap these elements
        while (number > 0) {
            int digit = number % 10;               // Get the last digit of the number
            reversed = reversed * 10 + digit;   // Add the digit to the reversed number
            number = number / 10;               // Remove the last digit
        }

        // Check if the reversed number is equal to the original number
        return original == reversed;
    }

    public static void main(String[] args) {
        int num = 121;
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
}
