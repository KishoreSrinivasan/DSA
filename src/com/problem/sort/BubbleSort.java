package com.problem.sort;

public class BubbleSort {
    
    // Move the first largest element to last and second ...
    static void sort(int[] arr) {
        
        for (int i=0; i<arr.length-1; i++) {
            
            boolean swapped = false;
            
            for (int j=0; j<arr.length-i-1; j++) {
                
                if (arr[j]>arr[j+1]) {
                    
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            
            if (!swapped) break;
        }
    }
    
    static void swap(int[] arr, int start, int end) {
        
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        
        int arr[] = { 6, 2, 5, 3, 7, 1, 9, 4};
        sort(arr);
        
        for (int element : arr) System.out.print(element + " ");
    }

}
