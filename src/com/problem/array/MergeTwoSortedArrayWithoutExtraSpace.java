package com.problem.array;

import java.util.Arrays;

// Hard
public class MergeTwoSortedArrayWithoutExtraSpace {
    
    // Algorithm
    
//    1) Initialize i,j,k as 0,0,n-1 where n is size of arr1 
//    2) Iterate through every element of arr1 and arr2 using two pointers i and j respectively
//        if arr1[i] is less than arr2[j]
//            increment i
//        else
//            swap the arr2[j] and arr1[k]
//            increment j and decrement k
//
//    3) Sort both arr1 and arr2 
    
    public static void merge(long arr1[], long arr2[], int n, int m) {

        // code here
        int i = 0;
        int j = 0;
        int k = n - 1;

        while (i <= k && j < m) {

            if (arr1[i] < arr2[j]) {

                i++;
                continue;
            }

            long temp = arr1[k];
            arr1[k] = arr2[j];
            arr2[j] = temp;
            j++;
            k--;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        
        long[] arr1 = { 1, 2, 4, 7, 8, 9};
        long[] arr2 = { 3, 5, 6, 8, 9};
        
        MergeTwoSortedArrayWithoutExtraSpace.merge(arr1, arr2, arr1.length, arr2.length);

    }

}
