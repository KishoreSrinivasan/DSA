package com.problem.array;

import java.util.Arrays;

// Hard
public class MergeTwoSortedArrayWithoutExtraSpace {
    
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
