import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Friststringhasemorelenth
{

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "kiwi");

        Optional<String> ss = words.stream().filter(i -> i.length() > 5).findFirst();
                       System.out.println(ss);






    }









}
