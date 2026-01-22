package org.example.Java8CodingPractice.easy;

import java.util.Arrays;
import java.util.List;

public class NumberDivisibleBy3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 7, 10, 15);

        //List<Integer> numbers = Arrays.asList(5, 7, 10, 14);

        boolean b = numbers.stream().anyMatch(e -> e % 3 == 0);

        if(b)
        {
            System.out.println("number is divisible by 3 is present in List ");
        }
        else
        {
            System.out.println("number is divisible by 3 is not present in List ");

        }
    }
}
