package com.problem.sort;

public class InsertionSort {
    
    // 0 -- sorted -- i-1, i -- unsorted -- n
    static void sort(int[] arr) {
        
        for (int i=0; i<arr.length; i++) {
            
            int key = arr[i];
            
            int j = i-1;
            
            while (j>=0 && arr[j]>key) {
                
                arr[j+1] = arr[j];
                j--;
            }
            
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {

        int arr[] = {4, 2, 7, 5, 9, 8, 1, 3, 6, 0};
        
        sort(arr);
        
        for (int element : arr) System.out.print(element +  " ");
    }

}
