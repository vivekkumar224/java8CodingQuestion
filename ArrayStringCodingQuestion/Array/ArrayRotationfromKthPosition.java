package org.example.ArrayStringCodingQuestion.Array;

import java.util.Arrays;

public class ArrayRotationfromKthPosition {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int k=3;



          a = leftRoatation(a, k);

        System.out.println(Arrays.toString(a));
    }

    private static int[] leftRoatation(int[] a, int k) {

        k=k%a.length;

        reverse(a,0,a.length-1);
        reverse(a,0,k-1);
         reverse(a,k,a.length-1);

         return a;


    }

    private static void reverse(int[] a, int i, int i1) {

        int start=i, end=i1;
        while (start<end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}
