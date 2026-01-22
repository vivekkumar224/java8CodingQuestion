package org.example.Java8CodingPractice.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class AllPostiveNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, -1,-2,3, 8, 2);

        /*boolean b = IntStream.rangeClosed(0, numbers.size() - 1).noneMatch(e -> numbers.get(e) < 0);

        if(b)
        {
            System.out.println("ALl numbers inside list are positive");
        }*/

        List<Integer> list=numbers.stream().filter(e->e>0).collect(Collectors.toList());

        System.out.println(list);
    }
}
