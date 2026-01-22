package org.example.ArrayStringCodingQuestion.string;

import java.util.HashMap;

public class LongestSubStringWithoutRepeatingCharacter1 {

    public static void main(String[] args) {
        String input= "abcabcbb";
        int left=0;
        int right=0;
        int max_length_subString=0;
        HashMap<Character,Integer> hashMap=new HashMap<>();
        while (right<input.length())
        {
            char c=input.charAt(right);

             if (!hashMap.containsKey(c))
             {
                 hashMap.put(c,right);
                 max_length_subString=Math.max(max_length_subString,right-left+1);



             }
             else
             {

                 left=Math.max(left,hashMap.get(c)+1);
             }
             right++;
        }
        System.out.println(max_length_subString);
    }
}
