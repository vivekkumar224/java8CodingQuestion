package org.example.Java8CodingPractice.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListInAscAndDescOrder {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(5, 2, 8, 2, 3, 5, 9, 3);

        List<Integer> collect = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("List in Ascending Order");
        System.out.println(collect);

        List<Integer> collect1 = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("List in Descending Order");

        System.out.println(collect1);




    }
}
