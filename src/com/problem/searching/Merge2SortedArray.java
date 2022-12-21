package com.problem.searching;

import java.util.Arrays;

public class Merge2SortedArray {
    
    // Without Extra space
    public static void merge(long arr1[], long arr2[], int n, int m) {

        // code here
        int arr1Start = 0;
        int arr2Start = 0;
        int arr1End = n - 1;

        while (arr1Start <= arr1End && arr2Start < m) {

            if (arr1[arr1Start] < arr2[arr2Start]) {

                arr1Start++;
                continue;
            }

            long temp = arr1[arr1End];
            arr1[arr1End] = arr2[arr2Start];
            arr2[arr2Start] = temp;
            arr2Start++;
            arr1End--;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        
        int n = 4; 
        long arr1[] = {1, 3, 5, 7};
        int m = 5; 
        long arr2[] = {0, 2, 6, 8, 9};
        
        Merge2SortedArray.merge(arr1, arr2, n, m);
        
        for (long element : arr1) System.out.print(element + " ");
        for (long element : arr2) System.out.print(element + " ");
    }

}
