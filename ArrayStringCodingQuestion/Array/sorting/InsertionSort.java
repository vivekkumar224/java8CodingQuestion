package org.example.ArrayStringCodingQuestion.Array.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a ={20,10,40,15,5};



       /*for (int i=1;i<a.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }

        }*/
        for(int i=1;i< a.length;i++)
        {
            int key=a[i];
            int j=i-1;
            while (j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
            System.out.println(Arrays.toString(a));

        }


        System.out.println(Arrays.toString(a));
    }
}
