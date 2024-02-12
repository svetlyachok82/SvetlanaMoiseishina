package Hometask9;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SortCollection {
    public static void main(String[] args) {
        List<String> myCollection = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        List<String> sortedStrings = myCollection.stream().sorted()
                .collect(Collectors.toList());
        System.out.println(sortedStrings);
    }
}

