public class CombinedMean {
    public static void main(String[] args) {
        int[] A = {1, 5, 7, 8, 9};
        int[] B = {12, 14, 16, 18, 19, 28};

        // Combine the arrays and calculate the mean
        double mean = getCombinedMean(A, B);
        System.out.println("Mean of combined arrays: " + mean);
    }

    static double getCombinedMean(int[] a, int[] b) {
        double sum = 0;
        int totalLength = a.length + b.length;

        for (int num : a) sum += num;
        for (int num : b) sum += num;

        return sum / totalLength;
    }
}
