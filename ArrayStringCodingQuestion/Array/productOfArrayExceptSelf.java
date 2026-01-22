package org.example.ArrayStringCodingQuestion.Array;

import java.util.Arrays;

public class productOfArrayExceptSelf {

    public static void main(String[] args) {
        int a[]={5,2,3,4};

        int output[]=new int[a.length];

        int left[]=new int[a.length];
        int right[]=new int[a.length];

        int n=a.length;
        left[0]=1;
        right[n-1]=1;

        for(int  i=1;i<n;i++)
        {
            left[i]=left[i-1]*a[i-1];
        }
        for(int j=n-2;j>=0;j--)
        {
            right[j]=right[j+1]*a[j+1];
        }

        for(int i=0;i<output.length;i++)
        {
            output[i]=left[i]*right[i];
        }
        System.out.println(Arrays.toString(output));
    }
}
