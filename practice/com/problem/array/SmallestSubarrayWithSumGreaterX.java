package com.problem.array;

public class SmallestSubarrayWithSumGreaterX {
    
    /*
     Given an array of integers (A[])  and a number x, 
     find the smallest subarray with sum greater than the given value. 
     If such a subarray do not exist return 0 in that case.

     Note: The answer always exists. It is guaranteed that x doesn't exceed the summation of a[i] (from 1 to N).
     */
    
    // Using two pointers approach
    static int smallestSubWithSum(int arr[], int n, int x) {
       
        int currSum = 0, minLen = n + 1;

        int start = 0, end = 0;
        
        while (end < n) {

            while (currSum <= x && end < n)
                currSum += arr[end++];
 
            while (currSum > x && start < n) {

                if (end - start < minLen)
                    minLen = end - start;

                currSum -= arr[start++];
            }
        }
        return minLen;
    }

    public static void main(String[] args) {
        
        int A[] = {1, 4, 45, 6, 0, 19};
        
        int x = 51;
        
        System.out.println(SmallestSubarrayWithSumGreaterX.smallestSubWithSum(A, A.length, x));
    }

}
