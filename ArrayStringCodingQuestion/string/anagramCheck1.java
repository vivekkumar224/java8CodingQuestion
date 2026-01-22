package org.example.ArrayStringCodingQuestion.string;

import java.util.HashMap;

public class anagramCheck1 {
    public static void main(String[] args) {
        String input = "listen";
        String string = "silent1";

        HashMap<Character, Integer> hashMap = new HashMap<>();


        if (input.length() != string.length()) {
            System.out.println("Not a anagram of each other");
        }
        else {


            for (int i = 0; i < input.length(); i++) {

                hashMap.put(input.charAt(i),hashMap.getOrDefault(input.charAt(i),0)+1);
                hashMap.put(string.charAt(i),hashMap.getOrDefault(string.charAt(i),0)-1);

            }
            for (int count:hashMap.values())
            {
                if(count!=0)
                {
                    System.out.println("both are not anagram of each other");
                    return;
                }
            }
            System.out.println("both are anagram of each other");




        }
    }
}
