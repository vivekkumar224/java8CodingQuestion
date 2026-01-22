package org.example.Java8CodingPractice.intermedium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartittionOfNumberInEvenOdd {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(e -> e % 2 == 0));

        System.out.println("Even No  "+ collect.get(true));

        System.out.println("Even No  "+ collect.get(false));
    }
}
