package com.problem.sortingProblems;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArray {
    
    public static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int i=0; 
        int j=0;
        
        while (i<arr1.length && j<arr2.length) {
            
            if (i>0 && arr1[i] == arr1[i-1]) {
                
                i++;
                continue;
            }
            
            if (arr1[i] > arr2[j]) j++;
            else if (arr1[i] < arr2[j]) i++;
            else {
                
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        int arr1[] = {20, 20, 40, 60};
        int arr2[] = {20, 20, 20, 33};
        
        System.out.print(intersection(arr1, arr2));

    }

}
