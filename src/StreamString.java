import java.util.Arrays;
import java.util.List;

public class StreamString
{

    public static void main(String[] args) {
       // List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Peach", "Apricot", "Berry");

        //long ss = words.stream().filter(i -> i.startsWith("A")).count();
        //System.out.println(ss);
        List<String> words = Arrays.asList("java", "stream", "example");
        words.stream().map(i->i.toUpperCase()).forEach(i->System.out.println(i));



    }


}
