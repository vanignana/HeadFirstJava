package datastructures;

import javax.crypto.spec.PSource;
//import java.awt.print.Book;
import java.util.Set;
import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go() {
        Book b1 = new Book("Book");
        Book b2 = new Book("Book2");
        Book b3 = new Book("Book3");

        Set<Book> tree = new TreeSet<>();
            tree.add(b1);
            tree.add(b2);
            tree.add(b3);

        System.out.println(tree);

    }
}
