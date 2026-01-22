package org.example.ArrayStringCodingQuestion.Array;

public class BuyAndSellStock {
    public static void main(String[] args) {
       // int [] prices={7,1,5,3,6,4};
        int [] prices={7,6,4,3,1};

        int max_sell=0;
        int profit=0;

        for (int i=0;i<prices.length;i++)
        {
            for (int j=i+1;j<prices.length;j++)
            {
                profit=prices[j]-prices[i];
                max_sell=Math.max(max_sell,profit);
            }
        }
        System.out.println(max_sell);
    }
}
