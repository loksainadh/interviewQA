public class FindTargetInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int target = 50;
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {          // for each row
            for (int j = 0; j < matrix[i].length; j++) {    // for each column
                if (matrix[i][j] == target) {
                    System.out.println("Target found at row " + i + ", column " + j);
                    found = true;
                    break; // optional, if you want to stop after finding
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {

            System.out.println("Target not found in the matrix.");
        }
    }
}
