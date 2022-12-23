package SamplePrograms;

public class ReverseOrder {

    public static void main(String[] args) {
        String originalStr = "Hello";
        String reversedStr = "";

        for(int i = 0; i < originalStr.length() ; i++){
            reversedStr = originalStr.charAt(i)+reversedStr;
        }

        System.out.printf(reversedStr);
    }
}
