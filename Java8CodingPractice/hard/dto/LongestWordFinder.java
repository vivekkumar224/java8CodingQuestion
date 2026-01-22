package org.example.Java8CodingPractice.hard.dto;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordFinder {

    public static void main(String[] args) {
        String sentence = "The quick, brown fox jumped over the lazy dog!";

        String[] s = sentence.replaceAll("[^a-z\\s]", "").split(" ");

        String s1 = Arrays.stream(s).max(Comparator.comparing(String::length)).get();
        System.out.println(s1);

    }
}
