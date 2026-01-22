package org.example.Java8CodingPractice.hard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachOfString {

    public static void main(String[] args) {

        /* String collect = Arrays.stream(sentence.split(" ")).map(e -> new StringBuffer(e).reverse()).collect(Collectors.joining(" "));

        System.out.println(collect);*/
        String sentence = "Java streams are powerful";
        String collect2 = Arrays.stream(sentence.split(" "))
                       .map(e -> Arrays.stream(e.split(""))
                               .reduce(" ", (rev, ch) -> ch + rev))
                               .collect(Collectors.joining(" "));

        System.out.println(collect2);
        String collect1 = Arrays.stream(sentence.split(" "))
                .map(word -> Arrays.stream(word.split(""))
                        .reduce("", (rev,ch) -> ch + rev))
                .collect(Collectors.joining(" "));
        System.out.println(collect1);




    }
}
