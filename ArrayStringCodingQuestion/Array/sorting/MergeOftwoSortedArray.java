package org.example.ArrayStringCodingQuestion.Array.sorting;

import java.util.Arrays;

public class MergeOftwoSortedArray {

    public static void main(String[] args) {
        int [] a={2,5,9,13,19};
        int [] b={2,8,10,16};

        int[] c =new int[a.length+ b.length];
        int i=0,j=0,k=0;

        while (i<a.length || j< b.length)
        {
            if(i<a.length && j< b.length )
            {
                if(a[i]<b[j])
                {
                    c[k]=a[i];
                    i++;
                    k++;
                }
                else
                {
                    c[k]=b[j];
                    j++;
                    k++;
                }
            }
            else
            {
                if(i<a.length)
                {
                    c[k]=a[i];
                    i++;
                    k++;
                }
                else
                {
                    c[k]=b[j];
                    j++;
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
