package datastructures;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class SortMountains {
    public static void main(String[] args) {
        new SortMountains().go();
    }

    private void go() {
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Longs",14233));
        mountains.add(new Mountain("Elbert",14688));
        mountains.add(new Mountain("Maroon",14256));
        mountains.add(new Mountain("Castle",14289));
        System.out.println(mountains);

        mountains.sort((one,two) -> one.name.compareTo(two.name));
        System.out.println(mountains);
        mountains.sort((one,two) -> two.height - one.height);
        System.out.println(mountains);
    }


}
