package lk.example.problem02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem02 {
    public static void main(String[] args) {
        
        List<String> stringList = Arrays.asList("a", "b", "c");
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Object> merged =mergeing(intList, stringList);
        System.out.println(merged);

    }

    public static List<Object> mergeing(List<Integer> integerList, List<String> stringList) {
        List<Object> merged = new ArrayList<>();
        int size = Math.min(integerList.size(), stringList.size());

        for (int i = 0; i < size; i++) {
            merged.add(stringList.get(i));
            merged.add(integerList.get(i));
        }
        return merged;
    }
}
