public class ArrayTargetSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;

        System.out.println("Pairs with sum " + target + ":");
        printPairs(arr, target);

        System.out.println("\nTriplets with sum " + target + ":");
        printTriplets(arr, target);
    }

    // Function to print all pairs
    public static void printPairs(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }

    // Function to print all triplets
    public static void printTriplets(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k] + " = " + target);
                    }
                }
            }
        }
    }
}
