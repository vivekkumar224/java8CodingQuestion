package org.example.Java8CodingPractice.easy;

import java.util.Arrays;
import java.util.List;

public class FIndFirstNonEmpty {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("", "", "Hello", "World", "");

        String string = strings.stream().filter(e -> !e.isEmpty()).findFirst().get();

        System.out.println(string);

    }
}
