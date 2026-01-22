package org.example.ArrayStringCodingQuestion.Array;

public class Max_product_SubArray {

    public static void main(String[] args) {

        int nums[]={2,3,-2,4};
       // int[] nums ={-3,-1,-1};

         int i = max_product_subarray(nums);

        System.out.println(i);

    }

    public static int max_product_subarray(int nums[])
    {

        //-3.-1,-1 ,,,   2,3,-2,4
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];  //2
        int minProduct = nums[0]; // 2

        int result = nums[0]; //2

        // 1,2
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] >= 0) {
                maxProduct = Math.max(nums[i], maxProduct * nums[i]);//4
                minProduct = Math.min(nums[i], minProduct * nums[i]); //-48
            }
            else {
                int temp = maxProduct; //6
                maxProduct = Math.max(nums[i], minProduct * nums[i]); //-2
                minProduct = Math.min(nums[i], temp * nums[i]); // -12
            }

            result = Math.max(result, maxProduct);
        }

        return result;

    }
}
