package org.example.ArrayStringCodingQuestion.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacter {

    public static void main(String[] args) {
       String input= "abcabcbb";
       int left=0;
       int right=0;
       int max_size=0;
        HashSet<Character>hashMap=new HashSet<>();

       while (right<input.length())
       {
            char ch=input.charAt(right);
            if(!hashMap.contains(ch))
            {
                hashMap.add(ch);
                max_size= Math.max(max_size,right-left+1);
                right++;

            }
            else
            {
                hashMap.remove(ch);
                left++;
            }

       }
       System.out.println(max_size);
    }
}
