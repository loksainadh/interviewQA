import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatrentheLists {

    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                 Arrays.asList("apple", "banana"),
                 Arrays.asList("cherry", "date"),
                Arrays.asList("kiwi", "lemon")
                );

        listOfLists.stream().flatMap(List::stream).collect(Collectors.toList()).forEach(i->System.out.println(i));
    }






}
