package org.example.ArrayStringCodingQuestion.Array.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int []arr={2,5,1,0,4,6,3};

        quickSort(arr,0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {

        if(start<end)
        {

            int pivot=partition(arr,start,end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }

    private static int partition(int[] arr, int start, int end) {

        int key=arr[end];
        int left=start-1;

        for(int i=start;i<end;i++)
        {
            if(arr[i]<=key)
            {
                left++;

                int temp=arr[i];
                arr[i]=arr[left];
                arr[left]=temp;
            }
        }


        int temp=arr[left+1];
         arr[left+1]=arr[end];
         arr[end]=temp;
         return left+1;
    }
   /*static int partition(int array[], int low, int high) {

       // choose the rightmost element as pivot
       int pivot = array[high];

       // pointer for greater element
       int i = (low - 1);

       // traverse through all elements
       // compare each element with pivot
       for (int j = low; j < high; j++) {
           if (array[j] <= pivot) {

               // if element smaller than pivot is found
               // swap it with the greatr element pointed by i
               i++;

               // swapping element at i with element at j
               int temp = array[i];
               array[i] = array[j];
               array[j] = temp;
           }

       }

       // swapt the pivot element with the greater element specified by i
       int temp = array[i + 1];
       array[i + 1] = array[high];
       array[high] = temp;

       // return the position from where partition is done
       return (i + 1);
   }*/
}
