package org.example.Java8CodingPractice.hard.dto;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SlidingWindowAverage {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4, 8, 15, 16, 23, 42);

        /*IntStream.rangeClosed(0,input.size()-3).mapToObj(e->(input.get(e)+input.get(e+1)+input.get(e+2))/3)
                .forEach(System.out::println);*/

        int window=4;
        List<List<Integer>> list = IntStream.rangeClosed(0, input.size() - window).mapToObj(e -> input.subList(e, e + window)).toList();
       // System.out.println(list);

        List<OptionalDouble> collect = list.stream().map(e -> e.stream().mapToInt(e1 -> e1).average()).collect(Collectors.toList());
        System.out.println(collect);

    }
}
