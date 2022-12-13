package Startup;

import java.util.Scanner;

public class Gamehelper {

    public int getUserInput(String prompt) {
        System.out.println(prompt + " : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }
}
