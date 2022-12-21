package Lambda;
import java.util.*;
import java.util.stream.*;

public class CoffeeOrder {

    public static void main(String[] args) {
        List<String> coffees = List.of("Cappo","Amero","Espreo","Cortado","Mocha","Cappo","Flat White","Latte");
        List<String> coffeesEndingInO = coffees.stream()
                                                .filter(s -> s.endsWith("o"))
                                                .sorted()
                                                .distinct()
                                                .collect(Collectors.toList());
        System.out.println(coffeesEndingInO);
     }

}
