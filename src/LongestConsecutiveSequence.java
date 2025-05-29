import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : nums) {

            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentpoint = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentpoint++;
                }

                maxLength = Math.max(maxLength,currentpoint);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 5, 7, 9, 2, 4, 6};
        System.out.println(longestConsecutive(input));  // Output: 7
    }
}
