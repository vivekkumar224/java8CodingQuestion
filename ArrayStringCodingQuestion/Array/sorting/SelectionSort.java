package org.example.ArrayStringCodingQuestion.Array.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int [] arr={7,2,8,5,6,9,3};

        for (int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i]; //7
                    arr[i]=arr[j];//2
                    arr[j]=temp;//7
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }


}
