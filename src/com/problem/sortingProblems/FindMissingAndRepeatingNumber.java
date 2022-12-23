package com.problem.sortingProblems;

import java.util.Arrays;

public class FindMissingAndRepeatingNumber {
    
    
    static int[] findTwoElement(int arr[], int n) {
        
        // code here
        Arrays.sort(arr);

        int repeating = 0;
        int notPresent = 1;

        for (int i = 0; i < n; i++) {

            if (i > 0 && arr[i - 1] == arr[i])
                repeating = arr[i];

            if (arr[i] == notPresent)
                notPresent++;
        }

        int result[] = new int[2];
        result[0] = repeating;
        result[1] = notPresent;

        return result;
    }

    public static void main(String[] args) {
        
        int result[] = {2, 2, 1, 3, 4};
        
        int arr[] = findTwoElement(result, result.length);
        
        System.out.print(arr[0] + " === " + arr[1]);
    }

}
