package org.example.ArrayStringCodingQuestion.string;

import java.util.HashMap;

public class anagramCheck {
    public static void main(String[] args) {
        String input = "listen";
        String string = "silent";

        HashMap<Character, Integer> hashMap = new HashMap<>();
        HashMap<Character, Integer> hashMap1 = new HashMap<>();

        if (input.length() != string.length()) {
            System.out.println("Not a anagram of each other");
        }
        else {


            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                char c1=string.charAt(i);
                if (hashMap.containsKey(c)) {
                    hashMap.put(c, hashMap.get(c) + 1);
                } else {
                    hashMap.put(c, 1);

                }
                if (hashMap1.containsKey(c1)) {
                    hashMap1.put(c1, hashMap1.get(c1) + 1);
                } else {
                    hashMap1.put(c1, 1);

                }
            }

            if (hashMap.equals(hashMap1)) {
                System.out.println("both are anagram of each other");
            } else {
                System.out.println("Not a anagram of each other");
            }


        }
    }
}
