package com.problem.sortingProblems;

import java.util.Arrays;

public class FindPairGivenDifference {
    
    static boolean findPair(int arr[], int size, int n) {
       
        Arrays.sort(arr);
        int i = 0;
        int j = 1;

        while (i < size && j < size) {
            if (i != j && arr[j] - arr[i] == n) {
                return true;
            } else if (arr[j] - arr[i] < n)
                j++;
            else
                i++;
        }

        return false;
    }

    public static void main(String[] args) {
        
        int arr[] = {2, 50, 3, 60, 3, 80};
        
        System.out.println(findPair(arr, arr.length, 78));

    }

}
