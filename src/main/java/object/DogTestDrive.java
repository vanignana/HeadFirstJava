package object;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.size = 10;
        d1.breed = "Small";
        d1.bark();
        Dog d2 = new Dog();
        d2.size1 = 20;
        //d2.breed = "Big";

        d2.eat(d1.size);
        System.out.println(d2.size1);


    }
}
