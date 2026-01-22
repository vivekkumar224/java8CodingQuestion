package org.example.Java8CodingPractice.easy;

import java.util.Arrays;
import java.util.List;

public class FIndFirstNonEmpty {

    public static void main(String[] args) {
        //List<String> strings = Arrays.asList("", "", "Hello", "World", "");
        List<String> strings = Arrays.asList("", "",  "");

        //String string = strings.stream().filter(e -> !e.isEmpty()).findFirst().get();
       String string=strings.stream().filter(e->!e.isEmpty()).findFirst().orElse("there is not non empty value");

        System.out.println(string);

    }
}
