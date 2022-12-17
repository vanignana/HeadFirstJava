package Startup;

public class SimpleStartupTestDrive {

    public static void main(String[] args) {
        SimpleStartup1 dot = new SimpleStartup1();

        int[] locations = {2,3,4};
        dot.setLocationsCells(locations);

         int userGuess = 2;
         String result = dot.checkYourself(userGuess);

         String testResult= "failed";

         if (result.equals("hit")) {
             testResult = "Passed";
         }
        System.out.println(testResult);
    }

}
