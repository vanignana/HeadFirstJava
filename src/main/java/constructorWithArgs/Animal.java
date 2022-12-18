package constructorWithArgs;

public abstract class Animal {
    private String name; //Instance Variable

    public String getName(){ //Method
        return name;
    }


    public Animal(String theName){ //Constructor
        name = theName;
    }
}
