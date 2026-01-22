package org.example.ArrayStringCodingQuestion.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class RemoveDuplicte {

    public static void main(String[] args) {

        String input= "abcabcbb";
        HashSet<String> hashSet=new HashSet<>();

        String collect = Arrays.stream(input.split("")).filter(hashSet::add).collect(Collectors.joining(""));
        System.out.println(collect);

    }


}
