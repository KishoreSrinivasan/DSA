package com.problem.array;

// Medium - DSA Sheet
public class KadanesAlgorithm2 {

    // To find the sum - largest continues sub aaray return starting and ending index

    public static int[] maxSubarraySum(int arr[], int n) {

        // Your code here
        long maxSoFar = Integer.MIN_VALUE;
        long maxEndingHere = 0;
        
        int start = 0;
        int end = 0;
        int updatedStart = 0;

        for (int i = 0; i < n; i++) {

            maxEndingHere = maxEndingHere + arr[i];

            if (maxSoFar < maxEndingHere) {
                
                maxSoFar = maxEndingHere;
                start = updatedStart;
                end = i;
            }

            if (maxEndingHere < 0) {
                
                maxEndingHere = 0;
                updatedStart = i + 1;
            }
                
        }
        
        int[] result = { start, end };

        return result;
    }

    public static void main(String[] args) {

        int[] arr = { -47, 43, 94, -94, -93, -59, 31, -86 };

        int[] result = KadanesAlgorithm2.maxSubarraySum(arr, arr.length);
        
        System.out.println(result[0] + " " + result[1]);
    }

}
