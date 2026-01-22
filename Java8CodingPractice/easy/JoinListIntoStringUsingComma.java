package org.example.Java8CodingPractice.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListIntoStringUsingComma {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");

        String collect = fruits.stream().collect(Collectors.joining(",", "[", "]"));

        System.out.println(collect);
    }
}
