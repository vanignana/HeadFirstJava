package Lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.String;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = List.of("I", "am", "a");
       List<String> result = strings.stream()
                .sorted((s1,s2)->s1.compareToIgnoreCase(s2))
                .skip(1) //skip one item from the list.
                .limit(4)
                .collect(Collectors.toList());
//        Stream<String> sort = stream.sorted();

//        Stream<String> limit = stream.limit(2);

//        Stream<String> sort = stream.sorted((s1, s2)->s1.compareToIgnoreCase(s2));
//        Stream<String> skip = stream.skip(2);




//        List<String> result1 = sort.collect(Collectors.toList());


//        List<String> result2 = skip.collect(Collectors.toList());
//       List<String> sort = (List<String>) strings.stream().sorted((s1, s2)->s1.compareToIgnoreCase(s2));
//        System.out.println(strings);
        System.out.println(result);
//       System.out.println(result1);
//        System.out.println(result2);
        }
    }

