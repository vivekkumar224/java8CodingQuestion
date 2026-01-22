package org.example.ArrayStringCodingQuestion.Array.sorting;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {

        int a[]={10,345,23,189,94,68};
        int max=a[0];

        for(int i=0;i<a.length;i++)
        {
            max=Math.max(max,a[i]);
        }
        for(int place=1; max/place>0; place*=10)
        {
            countingSort(a,place);
        }
        System.out.println(Arrays.toString(a));

    }

    public static void countingSort(int arr[], int place)
    {
        int [] count=new int[10];

        for(int i=0;i<arr.length;i++)
        {
            int key=(arr[i]/place)%10;

            count[key]++;
        }
        for(int i=1;i<count.length;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        int [] result=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--)
        {
            int key=(arr[i]/place)%10;
            int position= count[key]-1;
            result[position]=arr[i];

            count[key]--;
        }
        for (int i=0;i<result.length;i++)
        {
            arr[i]=result[i];

        }
    }
}
