import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Findfirstelement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 7, 8, 9, 11, 12, 13);


        Optional<Integer> ss = numbers.stream().filter(i -> i % 3 == 0).collect(Collectors.toList()).stream().findFirst();
             System.out.println(ss);


    }



}
