package org.example.Java8CodingPractice.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class SecondHighest {

    public static void main(String[] args) {

       List<Integer> numbers = Arrays.asList(5, 9, 11, 2, 8, 21, 1);
        //List<Integer> numbers = Arrays.asList(5);

        Stream<Integer> limit = numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).limit(1);

        List<Integer> list = numbers.stream().sorted(Comparator.comparing(e->e)).toList();
        System.out.println(list);
        System.out.println(limit.toList());

        Integer i = numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElseThrow(() -> new NoSuchElementException("there is only one element in list"));

        System.out.println(i);


    }




}
