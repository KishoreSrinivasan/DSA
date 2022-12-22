package com.problem.sort.partition;

public class LomutoPartition {
    
    static void partition(int arr[]) {
        
        int low = 0;
        int high = arr.length - 1;
        
        // taking the last index as pivot
        int pivot = arr[high];
        // in case they provided the index of pivot swap the position with last index
        
        int position = low-1;
        
        for (int i=low; i<high; i++) {
            
            if (arr[i]<=pivot) {
                
                position++;
                swap(arr, position, i);  
            }
        }
        
        swap(arr, ++position, high);
    }
    
    static void swap(int arr[], int i, int j) {
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        
        int arr[] = { 2, 4, 6, 3, 7, 5, 8, 6, 5};
        
        partition(arr);
        
        for (int element : arr) System.out.print(element + " ");
    }

}
