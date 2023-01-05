package com.problem.array;

public class TrappingRainWater {
    
    // Using Prefix and Suffix concept
    static long trappingWater(int arr[], int n) {
      
        // Your code here

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        int max = arr[0];

        for (int i = 0; i < n; i++) {

            max = Math.max(max, arr[i]);
            leftMax[i] = max;
        }

        max = arr[n - 1];

        for (int i = n - 1; i >= 0; i--) {

            max = Math.max(max, arr[i]);
            rightMax[i] = max;
        }

        long unit = 0;

        for (int i = 0; i < n; i++) {

            int min = Math.min(leftMax[i], rightMax[i]);
            unit = unit + (min - arr[i]);
        }

        return unit;
    }

    public static void main(String[] args) {

        int N = 6;
        int arr[] = {3,0,0,2,0,4};
        
        System.out.print(trappingWater(arr, N));
    }

}
