package com.problem.array;

// Medium
public class KadanesAlgorithm {
    
    // To find the sum - largest continues sub aaray

    public static long maxSubarraySum(int arr[], int n) {

        // Your code here
        long maxSoFar = Integer.MIN_VALUE;
        long maxEndingHere = 0;

        for (int i = 0; i < n; i++) {

            maxEndingHere = maxEndingHere + arr[i];

            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;

            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }

        return maxSoFar;
    }
    
    public static void main(String[] args) {

        int[] arr = { -47, 43, 94, -94, -93, -59, 31, -86};

        System.out.println(KadanesAlgorithm.maxSubarraySum(arr, arr.length));
    }
}
