package com.problem.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChocolateDistributionProblem {
    
    /*
     Given an array A[ ] of positive integers of size N, 
     where each value represents the number of chocolates in a packet. 
     Each packet can have a variable number of chocolates. There are M students, 
     the task is to distribute chocolate packets among M students such that :
     
     1. Each student gets exactly one packet.
     2. The difference between maximum number of chocolates given to a student and 
              minimum number of chocolates given to a student is minimum.
     */
    
    public static long findMinDiff (int[] arr, int n, int m) {
        
        // your code here
        Arrays.sort(arr);
        
        int minDiff = Integer.MAX_VALUE;
        
        int start = 0;
        int end = start + m - 1;
        
        for (int i=0; end<n; i++, end++) {
            
            int dif = arr[end] - arr[start + i];
            minDiff = Math.min(minDiff, dif);
        }
        
        return (long) minDiff;
    }
    
    public static void main(String[] args) {
        
        int N = 8; 
        int M = 5;
        int[] A = {3, 4, 1, 9, 56, 7, 9, 12};
        
        System.out.println(ChocolateDistributionProblem.findMinDiff(A, N, M));

    }

}
