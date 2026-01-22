package org.example.ArrayStringCodingQuestion.Array;

public class MaximumSumSubArray {

    public static void main(String[] args) {

      // int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int [] nums={-2,-1};


//brute force
        /*int Max_mum=0;
        int sum=0;

        if(a.length==1)
        {
            Max_mum=Math.max(Max_mum,a[0]);
            System.out.println(Max_mum);
            return;
        }



        for(int i=0;i<a.length;i++)
        {

            for(int j=i;j<a.length;j++)
            {
                sum=0;
               for(int k=i;k<=j;k++)
               {
                   sum=sum+a[k];

               }
              Max_mum=  Math.max(Max_mum,sum);

            }

        }
        System.out.println(Max_mum);*/

        //kadane algorithm

       /* int max_sum=0;
        int sum=0;
        int j=0;
        while (j<a.length)
        {
            sum=sum+a[j];
            if(sum<0)
            {
                sum=0;
            }
            max_sum=Math.max(max_sum,sum);
            j++;
        }
        System.out.println(max_sum);*/
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum = currentSum + nums[i];
            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }
        }

        System.out.println(maxSoFar);



    }
}
