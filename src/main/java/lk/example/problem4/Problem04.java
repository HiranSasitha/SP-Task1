package lk.example.problem4;

import java.util.Arrays;

public class Problem04 {
    public static void main(String[] args) {
        int[] numbers = {50,2,1,9};
        System.out.println("Largest Numb:  "+largestNumber(numbers));
    }

    public static String largestNumber(int[] nums) {

        String[] numStr1 = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStr1[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numStr1, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder largestNum = new StringBuilder();
        for (String numStr : numStr1) {
            largestNum.append(numStr);
        }

        return largestNum.toString();
    }
}
