package SamplePrograms;

import java.util.Scanner;

public class PrintWierd {
    private static final Scanner scan = new java.util.Scanner(System.in);

    public static void main(String[] args) {


        int N = scan.nextInt();
        int n = N;
        if(n%2 !=0 && n>=0){
            System.out.println("Weird");
        }
        else if(n%2 == 0 && n>2 && n<5 && n>=0){
            System.out.println("Not Weird");
        }
        else if(n%2 == 0 && n>6 && n<20 && n>=0){
            System.out.println("Weird");
        }
        else if(n%2 == 0 && n>=20 && n>=0){
            System.out.println("Not Weird");
        }
        else{
            System.out.println("Only Positive Numbers");
        }
    }
}
