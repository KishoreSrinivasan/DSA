package com.problem.array;

import java.util.ArrayList;

// Easy
public class MoveAllNegativeElementToTheEnd {
    
    public static void segregateElements(int arr[], int n)
    {
        // Your code goes here
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int index = 0;
        
        for (int i=0; i<n; i++) {
            
            if (arr[i] < 0) {
                
                list.add(arr[i]);
                
            } else {
                
                arr[index] = arr[i];
                index++;
            }
        }
        
        for (Integer element : list) {
            
            arr[index] = element;
            index++;
        }
    }

    public static void main(String[] args) {
     
        // In the given unsorted array move all the negative element to the end
             // and positive element to the begining - it should be stable 
        
        // example
        // arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
        // output : 1, 3, 2, 11, 6, -1, -7, -5
        
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        
        MoveAllNegativeElementToTheEnd.segregateElements(arr, arr.length);
        
        for (int element : arr) 
            System.out.print(element + " ");
    }

}
