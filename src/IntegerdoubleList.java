import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerdoubleList {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);



        numbers.stream().map(i->i*2).collect(Collectors.toList()).forEach(System.out::println);





    }


}
