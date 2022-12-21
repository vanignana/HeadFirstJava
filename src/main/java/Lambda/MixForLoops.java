package Lambda;

import java.util.List;

public class MixForLoops {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5);
        String output = "";

//        for (int i = 0; i <= nums.length(); i++) {
//            output += nums.get(i) + " ";
//        }
        for (Integer num : nums){
            output += nums + " ";
        }
        System.out.println(output);
    }
}
