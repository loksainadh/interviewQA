import java.util.HashMap;
import java.util.Map;

public class FindDuplicateIPs {
    public static void main(String[] args) {
        // Input string containing IP addresses
        String ipString = "192.168.1.1, 192.168.1.2, 192.168.1.1, 192.168.1.3, 192.168.1.2";
        
        // Call the method to find duplicates
        findDuplicateIPs(ipString);
    }

    public static void findDuplicateIPs(String ipString) {
        // Split the input string by commas
        String[] ipArray = ipString.split(",\\s*");
        
        // Use a HashMap to count occurrences of each IP
        Map<String, Integer> ipCountMap = new HashMap<>();
        
        // Loop through the array and populate the map with the counts
        for (String ip : ipArray) {
            ipCountMap.put(ip, ipCountMap.getOrDefault(ip, 0) + 1);
        }
        
        // Loop through the map and print the IPs that have more than one occurrence
        System.out.println("Repeated IPs:");
        for (Map.Entry<String, Integer> entry : ipCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times.");
            }
        }
    }
}
