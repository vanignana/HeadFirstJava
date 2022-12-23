package SamplePrograms;

import javax.lang.model.element.Element;

public class GenericMethodTest {

    public static <E> void printArray(E[] inputArray){
        for(E element : inputArray){
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArray = {'H','E','L','L','O'};

        System.out.println("IntArray");
        printArray(intArray);
        System.out.println("\nDoubleArray");
        printArray(doubleArray);
        System.out.println("\nCharArray");
        printArray(charArray);
    }
}
