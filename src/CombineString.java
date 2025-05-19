import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombineString {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Hello", "World", "Java", "Stream");

         String ss = words.stream().collect(Collectors.joining(" "));

         System.out.println(ss);













    }



}
