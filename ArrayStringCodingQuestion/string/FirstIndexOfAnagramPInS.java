package org.example.ArrayStringCodingQuestion.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FirstIndexOfAnagramPInS {


    public static void main(String[] args) {
        //String s="cbaebabacd";
       // String p="abc";
        String     s = "abab";
        String p = "ab";
        HashMap<Character,Integer> pMap=new HashMap<>();
        HashMap<Character,Integer> sMap=new HashMap<>();
        int left=0;
        int right=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<p.length();i++)
        {
            char c=p.charAt(i);
            pMap.put(c,pMap.getOrDefault(c,0)+1);
        }
        while (right<s.length())
        {
            char c=s.charAt(right);
            sMap.put(c,sMap.getOrDefault(c,0)+1);


            while (right-left+1>p.length())
            {
                char c1 = s.charAt(left);
                sMap.put(c1,sMap.get(c1)-1);
                if(sMap.get(c1)==0)
                {
                    sMap.remove(c1);
                }
                left++;
            }

            if(sMap.size()==pMap.size())
            {
                if(sMap.equals(pMap))
                {
                    list.add(left);
                }
            }

            right++;
        }
        System.out.println(list);

    }
}
