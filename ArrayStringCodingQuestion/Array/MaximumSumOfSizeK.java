package org.example.ArrayStringCodingQuestion.Array;

public class MaximumSumOfSizeK {

    public static void main(String[] args) {
       int  arr[] = {2, 1, 5, 1, 3, 2};
        int  k = 3;
        int left=0;
        int right=0;
        int max_sum=0;
        int sum=0;
        int count=0;
        int count1=0;

        while (right<arr.length)
        {

             sum=sum+arr[right];

             count++;

             if(right-left+1==k)
             {

                 count1++;
                 max_sum=Math.max(max_sum,sum);
                 sum=sum-arr[left];
                 left++;

             }

             right++;
        }
        System.out.println(max_sum);
        System.out.println(count);
        System.out.println(count1);
    }
}
