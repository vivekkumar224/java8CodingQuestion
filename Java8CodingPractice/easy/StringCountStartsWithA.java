package org.example.Java8CodingPractice.easy;

import java.util.Arrays;
import java.util.List;

public class StringCountStartsWithA {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");

        long count = fruits.stream().filter(e -> e.charAt(0) == 'A' || e.charAt(0) == 'a').count();

        System.out.println("Using charAt method");

        System.out.println(count);

        long count1 = fruits.stream().filter(e->e.startsWith("A") || e.startsWith("a")).count();

        System.out.println("Using starWith method");

        System.out.println(count1);



    }
}
