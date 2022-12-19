package com.problem.array;

import java.util.HashSet;

public class TripletSumInArray {
    
    /*
     Given an array arr of size n and an integer X. 
     Find if there's a triplet in the array which sums up to the given integer X.
     */
    
    // another approach is sort the array and use sliding window concept
    public static boolean find3Numbers(int A[], int n, int X) { 
        
        // Your code Here
        for (int i=0; i<n-2; i++) {
            
            HashSet<Integer> set = new HashSet<Integer>();
            
            int value = X - A[i];
            
            for (int j=i+1; j<n; j++) {
                
                // incase if we want to print the no print A[i] , A[j], value-A[j]
                if (set.contains(value-A[j]))  return true;
                
                set.add(A[j]);
            }
        }
        
        return false;
     
     }

    public static void main(String[] args) {
        
        int n = 6;
        int x = 13;
        
        int arr[] = {1, 4, 45, 6, 10, 8};
        
        System.out.print(TripletSumInArray.find3Numbers(arr, n, x));
    }

}
