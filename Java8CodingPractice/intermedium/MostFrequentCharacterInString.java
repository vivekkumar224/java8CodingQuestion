package org.example.Java8CodingPractice.intermedium;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MostFrequentCharacterInString {

    public static void main(String[] args) {
        String input = "banana";

        Optional<Map.Entry<Character, Long>> max = input.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(max.get().getKey());

    }
}
