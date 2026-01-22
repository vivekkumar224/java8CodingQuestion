package org.example.ArrayStringCodingQuestion.Array.sorting;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int [] arr={2,5,1,4,3,9,8,9,1,10};


        int max=max_of_array(arr);
        //System.out.println(max);
        int [] count=new int[max+1];
        for(int num:arr)
        {
            count[num]++;
        }
        System.out.println(Arrays.toString(count));
        for(int i=1;i<count.length;i++) {
            count[i] = count[i] + count[i - 1];
        }
        System.out.println(Arrays.toString(count));
        int [] result=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            int position=count[arr[i]]-1;
            result[position]=arr[i];
            count[arr[i]]--;
        }

        for (int i=0;i<result.length;i++)
        {
            arr[i]=result[i];

        }
        System.out.println(Arrays.toString(arr));




    }

    private static int max_of_array(int[] arr) {

        int max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
}
