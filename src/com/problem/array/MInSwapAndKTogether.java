package com.problem.array;

public class MInSwapAndKTogether {
    
/*
Given an array of n positive integers and a number k. 
Find the minimum number of swaps required to bring all the numbers less than or equal to k together. 

Example: 

Input:  arr[] = {2, 1, 5, 6, 3}, k = 3
Output: 1
Explanation: 
To bring elements 2, 1, 3 together, swap element ‘5’ with ‘3’ such that final array will be arr[] = {2, 1, 3, 6, 5}

Input:  arr[] = {2, 7, 9, 5, 8, 7, 4}, k = 5
Output: 2
*/
    
    public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        
        // find the no of elements less that or equal to k
        int lessOrEqual = 0;
        for (int element : arr) {
            
            if (element <= k) lessOrEqual++;
        }
        
        
        // using sliding window technique finding the min value
        int result;
        int current = 0;
        int i;
        
        for (i=0; i<lessOrEqual; i++) {
            
            if (arr[i] > k) current++;
        }
        
        result = current;
        
        for (int j =0; i<n; i++, j++) {
            
            if (arr[j] > k) current--;
            
            if (arr[i] > k) current++;
            
            result = Math.min(result, current);
        }
        
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
