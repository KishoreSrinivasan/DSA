package com.problem.sort;

public class QuickSortUsingLomutoPartition {
    
    static int partition(int arr[], int low, int high) {

        int pivot = arr[high];

        int position = low - 1;

        for (int i = low; i < high; i++) {

            if (arr[i] < pivot) {

                position++;
                swap(arr, position, i);
            }
        }

        swap(arr, ++position, high);

        return position;
    }
    
    static void swap(int arr[], int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void sort(int arr[], int low, int high) {
        
        if (low<high) {
            
            int part = partition(arr, low, high);
            sort(arr, low, part-1);
            sort(arr, part+1, high);
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {4, 6, 9, 1, 5, 3, 5, 4, 2, 7, 8};
        
        sort(arr, 0, arr.length-1);
        
        for (int element : arr) System.out.print(element + " ");
    }

}
