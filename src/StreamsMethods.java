import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class StreamsMethods {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
           //  numbers.stream().filter(i->i%2!=0).forEach(i->System.out.println(i));
//Optional<Integer> aa=numbers.stream().max(Integer::compareTo);
        OptionalDouble aa = numbers.stream().mapToInt(Integer::intValue).average();

   System.out.println(aa);



    }

}
