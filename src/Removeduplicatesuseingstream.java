import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Removeduplicatesuseingstream {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(5, 3, 9, 5, 1, 3, 8);

        numbers.stream().distinct().collect(Collectors.toList()).forEach(i->System.out.println(i));
    }





}
