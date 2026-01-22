package org.example.Java8CodingPractice.hard;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Top3FrequentWords {

    public static void main(String[] args) {
        String paragraph = "Java is great great is. Java is object oriented. Java streams are powerful, and Java is fun!";

        String[] s = paragraph.toLowerCase().
                replaceAll("[^a-z\\s]", "").
                split(" ");

        Map<String, Long> collect = Arrays.stream(s).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        System.out.println(collect);

        List<Map.Entry<String, Long>> list = collect.entrySet().stream().
                sorted((e1, e2) -> e2.getValue().intValue() - e1.getValue().intValue()).limit(3)
                .toList();

        System.out.println(list);

        List<Map.Entry<String, Long>> list1 = collect.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(3).toList();
        System.out.println(list1);

        List<Long> list2 = collect.entrySet().stream().map(Map.Entry::getValue).distinct().limit(3).toList();
        System.out.println(list2);

        List<Map.Entry<String, Long>> collect1 = collect.entrySet().stream().filter(e -> list2.contains(e.getValue())).collect(Collectors.toList());
        System.out.println(collect1);


    }
}
