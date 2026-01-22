package org.example.Java8CodingPractice.easy;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class FilterEvenFromList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13);

        System.out.println("Even no of the list");
        list.stream().filter(e->e%2==0).forEach(System.out::println);
        System.out.println("Square of number");
        list.stream().map(e->e*e).forEach(System.out::println);
        System.out.println("Square of even number");
        list.stream().filter(e->e%2==0).map(e1->e1*e1).forEach(System.out::println);

        System.out.println("Print first number greater than 10");
        Integer i = list.stream().filter(e -> e > 10).findFirst().orElseThrow(()-> new NoSuchElementException("no value greater 10 is present "));
        System.out.println(i);
        System.out.println("count the no of value grater than 5");
        long count = list.stream().filter(e -> e > 5).count();
        System.out.println(count);
        System.out.println("sum of data inside list");
        int sum = list.stream().mapToInt(e -> e).sum();

        System.out.println(sum);

        IntSummaryStatistics collect = list.stream().collect(Collectors.summarizingInt(e -> e));
        System.out.println("sum of data inside list");
        System.out.println(collect.getSum());
        System.out.println("maximum data inside list");
        System.out.println(collect.getMax());
        System.out.println("average data inside list");
        System.out.println(collect.getAverage());
        System.out.println("minimum data inside list");
        System.out.println(collect.getMin());




    }
}
