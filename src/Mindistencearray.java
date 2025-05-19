public class Mindistencearray {

    public int m1(int[] arr, int k) {
        int initialsum = 0;
        int totalsum = Integer.MAX_VALUE;

        // Check for element presence
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                System.out.println(k + " initial sum found 1");
            }
        }

        // Only proceed if array length is at least 2
        if (arr.length < 2) {
            return 0;
        }

        // Calculate initial sum of first 2 elements
        for (int i = 0; i < 2; i++) {
            initialsum += arr[i];
        }

        totalsum = initialsum;

        // Sliding window to find minimum sum of 2 consecutive elements
        for (int i = 2; i < arr.length; i++) {
            initialsum = initialsum - arr[i - 2] + arr[i];

            if (totalsum ==k) {
                totalsum = Math.min(totalsum, initialsum);
            }
        }

        return totalsum;
    }

    public static void main(String[] args) {
        Mindistencearray a = new Mindistencearray();

        int[] arr = {1, 2, 3, 4, 5};
        int result = a.m1(arr, 15);

        System.out.println(result);
    }
}
