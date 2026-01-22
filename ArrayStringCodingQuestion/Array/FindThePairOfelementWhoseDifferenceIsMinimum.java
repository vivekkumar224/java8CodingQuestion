package org.example.ArrayStringCodingQuestion.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindThePairOfelementWhoseDifferenceIsMinimum {

    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 10, 15};

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        List<int[]> result = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];

            if (diff < minDiff) {
                minDiff = diff;
                result.clear();
                result.add(new int[]{arr[i - 1], arr[i]});
            } else if (diff == minDiff) {
                result.add(new int[]{arr[i - 1], arr[i]});
            }
        }

        System.out.println("Minimum Absolute Difference: " + minDiff);
        for (int[] pair : result) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}
