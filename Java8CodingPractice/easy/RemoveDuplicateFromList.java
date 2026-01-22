package org.example.Java8CodingPractice.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 2, 3, 5, 9, 3);


        List<Integer> collect= numbers.stream().distinct().toList();

        System.out.println(collect);
    }
}
