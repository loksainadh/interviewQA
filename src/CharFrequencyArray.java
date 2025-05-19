public class CharFrequencyArray {
    public static void main(String[] args) {
        String input = "hello world";
        int[] freq = new int[256]; // for ASCII characters

        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                freq[ch]++;
            }
        }

        // Print non-zero frequencies
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
    }
}
