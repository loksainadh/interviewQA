import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Groupstringsbylength {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "batman", "cherry", "dog", "elephant");
          words.stream().collect(Collectors.groupingBy(String::length)).entrySet().forEach(i->System.out.println(i.getKey()+""+i.getValue()));

    }



}
