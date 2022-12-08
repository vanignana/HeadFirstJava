package object;

public class Dog {
    int size;
    int size1;
    String breed;
    String name;

    void bark(){
        System.out.println("bark");
    }
    void eat(int size1){ // overloading
        System.out.println("eat");
    }
}
