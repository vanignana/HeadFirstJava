public class Output {
    public static void main(String[] args) {
        Output output = new Output();
        output.go();
    }

    private void go() {
        int value  = 7;
        for (int i = 0 ; i < 8 ; i++) {
            value++;
            if (i > 4) {
                System.out.println(++value + "");
            }
            if (value > 14) {
                System.out.println(" i = " + i);
                break;
            }
        }
    }
}
