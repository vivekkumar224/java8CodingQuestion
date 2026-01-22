package org.example.ArrayStringCodingQuestion.string;

import java.util.HashMap;

public class longestSubStringWithKDistinctCharachter {

    public static void main(String[] args) {
        String s1="abcabcbbcdef";
        int k=2;

        int left=0;
        int right=0;
        int max_size=0;
        HashMap<Character,Integer> hashMap=new HashMap<>();

        while (right<s1.length())
        {
            char c=s1.charAt(right);
            if(hashMap.containsKey(c))
            {
                hashMap.put(c,hashMap.get(c)+1);
            }
            else
            {
                hashMap.put(c,1);
            }
            while (hashMap.size()>2)
            {
                char c1 = s1.charAt(left);

                hashMap.put(c1,hashMap.get(c1)-1);
                if(hashMap.get(c1)==0)
                {
                    hashMap.remove(c1);
                }

                left++;

            }

             max_size = Math.max(max_size, right - left + 1);

            right++;
        }
        System.out.println(max_size);
    }
}
