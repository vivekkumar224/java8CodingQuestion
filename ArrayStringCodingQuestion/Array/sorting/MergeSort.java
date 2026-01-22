package org.example.ArrayStringCodingQuestion.Array.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int [] arr={20,10,0,80,40,15};

        mergeSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {

        if(start<end)
        {
            int mid=(start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            combine(arr,start,mid,end);
        }

    }

    private static void combine(int[] arr, int start, int mid, int end) {

        int totalLength=end-start+1;
        int [] c=new int[totalLength];

        int i=start,j=mid+1;
        int k=0;
        while (i<=mid && j<=end)
        {
            if(arr[i]<arr[j])
            {
                c[k]=arr[i];
                i++;
                k++;
            }
            else
            {
                c[k]=arr[j];
                j++;
                k++;
            }
        }
        while (i<=mid)
        {
            c[k]=arr[i];
            i++;
            k++;
        }
        while (j<=end)
        {
            c[k]=arr[j];
            j++;
            k++;
        }

        for(int p=0; p<c.length;p++)
        {
            arr[p+start]=c[p];
        }
    }
}
