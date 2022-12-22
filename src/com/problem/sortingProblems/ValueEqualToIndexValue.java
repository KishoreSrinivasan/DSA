package com.problem.sortingProblems;

import java.util.ArrayList;

public class ValueEqualToIndexValue {
    
    static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < n; i++) {
            
            if (arr[i] == i + 1)
                list.add(arr[i]);
        }
        
        return list;
    }

    public static void main(String[] args) {
        
        int arr[] = { 3, 5, 2, 6, 7, 6, 8, 1, 9, 5};
        
        System.out.print(valueEqualToIndex(arr, arr.length));
    }

}
