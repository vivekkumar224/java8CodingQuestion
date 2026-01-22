package org.example.ArrayStringCodingQuestion.Array;

public class Max_consecutiveOnes {
    public static void main(String[] args) {
        int a[]={1,0,1,1,0,1};

        int count=0;
        int inner_count=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)
            {
                inner_count++;
            }
            if(a[i]==0)
            {
                  count = Math.max(count, inner_count);
                inner_count=0;
            }
        }

        System.out.println(count);

    }
}
