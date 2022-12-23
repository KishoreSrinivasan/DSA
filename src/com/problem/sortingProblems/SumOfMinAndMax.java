package com.problem.sortingProblems;

public class SumOfMinAndMax {
    
    static int findSum(int arr[]) {
        
        if (arr.length==1) return arr[0];
        
        int min = 0;
        int max = 0;
        
        if (arr[0] > arr[1]) {
            
            min = arr[1];
            max = arr[0];
            
        } else {
            
            min = arr[0];
            max = arr[1];
        }
        
        for (int i=2; i<arr.length; i++) {
            
            if (arr[i] > max) max = arr[i];
            else if (arr[i] < min) min = arr[i];
        }
        
        return min+max;
    }

    public static void main(String[] args) {
        
        int arr[] = {-2, -1, 0, 5, 4, 6, 2};
        
        System.out.print(findSum(arr));
    }

}
