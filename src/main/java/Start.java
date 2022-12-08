public class Start {
    public static void main(String[] args) {
        int x = 3;
        String name = "Dirk";
        x = x * 17;
        System.out.println("x is : " +x);
        double d = Math.random();
        while (x > 12) {
            x = x - 1;
            System.out.println("x value after while loop: "+x);
        }
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("i is now : " + i);
        }

        if (x == 10) {
            System.out.println("x must be 10");
        }
        else {
            System.out.println(" x is not 10");
        }
        if ((x > 3) && (name.equals("Dirk"))){
            System.out.println("Gently");
        }
        System.out.println("this line runs no matter what");
    }
}
