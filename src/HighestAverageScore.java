import java.util.*;

public class HighestAverageScore {
    public static void main(String[] args) {
        String[][] input = {
            {"Alice", "90"},
            {"Bob", "85"},
            {"Alice", "95"},
            {"Charlie", "78"},
            {"Bob", "80"},
            {"Charlie", "82"}
        };

        Map<String, List<Integer>> scoresMap = new HashMap<>();
        for (String[] entry : input) {
            String name = entry[0];
            int score = Integer.parseInt(entry[1]);

            scoresMap.computeIfAbsent(name, k -> new ArrayList<>()).add(score);
        }


        String topStudent = null;
        int highestAvg = 0;

        for (Map.Entry<String, List<Integer>> entry : scoresMap.entrySet()) {
            String name = entry.getKey();
            List<Integer> scores = entry.getValue();

            int sum = scores.stream().mapToInt(Integer::intValue).sum();
            int avg = sum / scores.size(); // Integer division rounds down

            if (avg > highestAvg) {
                highestAvg = avg;
                topStudent = name;
            }
        }

        System.out.println("Highest average score (rounded down): " + highestAvg);
    }
}
