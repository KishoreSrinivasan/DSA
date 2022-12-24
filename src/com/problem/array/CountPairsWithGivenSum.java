package com.problem.array;

import java.util.HashMap;

public class CountPairsWithGivenSum {
    
    // in tha given array find the no of pairs are equal to sum value
    static int getPairsCount(int[] arr, int n, int k) {

        // code here
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int count = 0;

        for (int i = 0; i < n; i++) {

            int value = k - arr[i];

            if (map.containsKey(value)) {

                count = count + map.get(value);

            }

            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);

        }

        return count;
    }

    public static void main(String[] args) {
        
        int arr[] = {1, 5, 5, 5, 5, 7};
        
        System.out.print(getPairsCount(arr, arr.length, 10));

    }

}
