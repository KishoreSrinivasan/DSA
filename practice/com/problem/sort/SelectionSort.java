package com.problem.sort;

public class SelectionSort {
    
    // finding the minimum element and putting in 1st place and 2nd...
    static void sort(int arr[]) {
        
        for (int i=0; i<arr.length-1; i++) {
            
            int min = i;
            
            for (int j = i+1; j<arr.length; j++) {
                
                if (arr[j] < arr[min]) min = j;
            }
            
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {2, 5, 1, 4, 7, 8, 3, 5};
        
        sort(arr);
        
        for (int element : arr) System.out.print(element + " ");
    }

}
