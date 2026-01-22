package org.example.ArrayStringCodingQuestion.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"flower", "flow", "flight"};
        String s3=null;

        Boolean flag=false;

        if (s.length==1)
        {
            System.out.println(s[0]);
        }
        String s1 = Arrays.stream(s).min(Comparator.comparing(String::length)).orElse(null);
        //System.out.println(s1);
        if(s1.isEmpty())
        {
            System.out.println(s1);
        }
        else
        {
            //  String[] s = {"flower", "flow", "flight"};
            for(int i=0;i<s1.length();i++)
            {
                char c=s1.charAt(i);

                for(String s2: s)
                {
                    if(s2.charAt(i)!=c)
                    {
                        s3=s1.substring(0,i);
                        flag =true;
                    }
                }
                if (flag)
                {
                    break;
                }
            }

        }
        System.out.println("Common prefix between all string insside array  "+ s3);


    }
}
