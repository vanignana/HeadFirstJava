package Constructor;

public class Duck extends Animal{
    int size;
    public Duck(){
        //this(); //Recursive constructor invocation
        System.out.println("Maa");
    }
    public Duck(int duckSize){
        //Call to 'super()' must be first statement in constructor body
        super();
        System.out.println("Quack");
        size = duckSize;

        System.out.println("Size is " +size);
    }
    public void setSize(int newSize){
        size = newSize;
        System.out.println(size);
    }
}
