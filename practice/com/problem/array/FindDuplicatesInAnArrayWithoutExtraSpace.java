package com.problem.array;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicatesInAnArrayWithoutExtraSpace {
    
    public static ArrayList<Integer> duplicates(int arr[], int n) {

        // code here
        Arrays.sort(arr);
        
        ArrayList<Integer> duplicates = new  ArrayList<Integer>();
        int index = 0;
        int i;
        
        for (i=1; i<n; i++) {
            
            if (arr[index] == arr[i]) continue;
            else {
                
                if ((i-index)>1) {
                    
                    duplicates.add(arr[index]);
                    index = i;
                    
                } else index++;
            }
        }
        
        if ((i-index)>1) duplicates.add(arr[index]);
        
        if (duplicates.isEmpty()) duplicates.add(-1);
        
        return duplicates;
        
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int[] arr = { 2, 3, 1, 2, 3};
        FindDuplicatesInAnArrayWithoutExtraSpace.duplicates(arr, arr.length);
    }

}
