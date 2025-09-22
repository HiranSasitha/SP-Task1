package org.example.problem1;

import java.util.Arrays;
import java.util.List;

public class Problem01 {
    public static void main(String[] args) {

        List<Integer> sample = Arrays.asList(11, 12, 13, 140, 150);

        int forLoop = forLop(sample);
        int whileLoop = wileLoop(sample);
        int recursion = recursion(sample);

        System.out.println("for loop - " + forLoop);
        System.out.println("while loop - " + whileLoop);
        System.out.println("recursion - " + recursion);
    }

    public static int forLop(List<Integer> list) {
        int sum1 = 0;
        for (int i = 0; i < list.size(); i++) {
            sum1 = sum1 + list.get(i);
        }
        return sum1;
    }

    public static int wileLoop(List<Integer> list) {
        int sum2 = 0;
        int i = 0;
        while (i < list.size()) {
            sum2 += list.get(i);
            i++;
        }
        return sum2;
    }

    public static int recursion(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.get(0) + recursion(list.subList(1, list.size()));
        }
    }
}

