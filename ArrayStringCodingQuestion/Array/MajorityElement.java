package org.example.ArrayStringCodingQuestion.Array;

public class MajorityElement {
    public static void main(String[] args) {

        int [] arr={1,2,3,2,2,4,2,2};
        int mc=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==mc)
            {
                count++;
            }
            else
            {
                count--;
                if(count==0)
                {
                    mc=arr[i];
                    count=1;
                }

            }
        }
        System.out.println(mc);

    }
}
