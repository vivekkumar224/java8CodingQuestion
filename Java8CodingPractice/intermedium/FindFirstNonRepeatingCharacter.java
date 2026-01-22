package org.example.Java8CodingPractice.intermedium;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";

        Character c1 = str.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(e1 -> e1.getKey())
                .findFirst().get();
        System.out.println(c1);
    }
}
