package polymorphism;

//import object.Dog;

public class MyDogList {
    private Dog[] dogs = new Dog[5];
    private int nextIndex = 0;

    public void add(Dog d) {
        if (nextIndex < dogs.length) {
            dogs[nextIndex] = d;
            System.out.println("Dogs added at " +nextIndex);
            nextIndex++;
        }
    }

}
