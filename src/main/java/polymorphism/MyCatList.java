package polymorphism;

//import object.Cat;

public class MyCatList {
    private Cat[] Cats = new Cat[5];
    private int nextIndex = 0;

    public void add(Cat c) {
        if (nextIndex < Cats.length) {
            Cats[nextIndex] = c;
            System.out.println("Cats added at " +nextIndex);
            nextIndex++;
        }
    }

}


