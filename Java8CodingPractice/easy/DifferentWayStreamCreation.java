package org.example.Java8CodingPractice.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentWayStreamCreation {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6);

        Integer [] a1={1,2,3,4,5,6,7};
        String string="Vivek Kumar Singh";


        Stream<Integer> stream = list.stream();

        Stream<Integer> stream1 = Arrays.stream(a1);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 5, 6, 7);

        Stream<String> stream2 = Arrays.stream(string.split(" "));

        Stream<Integer> limit = Stream.iterate(1, n -> n + 1).limit(10);

        Stream<Double> limit1 = Stream.generate(Math::random).limit(10);

        System.out.println(stream);
        System.out.println(stream1);
        System.out.println(integerStream);
        System.out.println(stream2);
        System.out.println(limit1);
        System.out.println(limit1);


        List<Integer[]> limit2 = Stream.iterate(new Integer[]{0, 1},arr -> new Integer[]{arr[1], arr[0] + arr[1]}).limit(6).toList();

       // Stream.iterate(new Integer[]{0,1}, arr-> new Integer[]{arr[1],arr[0]+arr[1]}).limit(6).toList();
        System.out.println(limit2);
        limit2.stream().forEach(e->System.out.println(Arrays.toString(e)));
        limit2.stream().map(arr->arr[0]).forEach(System.out::println);


    }
}
