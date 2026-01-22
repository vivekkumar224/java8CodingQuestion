package org.example.ArrayStringCodingQuestion.Array.ArrayMethods;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {
        Integer arr[]={10,4,5,3,12,8};

       // Arrays.sort(arr, (e1, e2)->Integer.compare((int)e2,(int)e1) );
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        final int i = Arrays.binarySearch(arr, 3,6,10);

        System.out.println(i);
    }
}
