package org.example.ArrayStringCodingQuestion.Array.SumOfTwoNumber;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class SumOfTwoNumberUsingHasMap {

    public static void main(String[] args) {

        int a[]= {2, 7, 11, 15};
        int target=9;

        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for(int i=0;i<a.length;i++ )
        {
            hashMap.put(a[i],i);//[2,0],[7,1],[11,2],[15,3]


        }
        System.out.println(hashMap);
        for(int i=0;i<a.length;i++)
        {

                int secondElemnt=target-a[i];
                if(hashMap.containsKey(secondElemnt))
              {
                System.out.println("["+ i+","+ hashMap.get(secondElemnt)+"]");
              }


        }



    }
}
