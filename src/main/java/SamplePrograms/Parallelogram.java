package SamplePrograms;


import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int H = scanner.nextInt();

        int b = B;

        int h = H;

        if (b>0 && h>0 && b<100 && h<100){
            System.out.println(b*h);
        }
//        else if (b>=-100 && h>=-100 ) {
//            throw new Exception("Breadth and height must be positive");
//        }
            else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
    }
}
