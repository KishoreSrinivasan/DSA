package com.problem.sort.partition;

public class HoarePartition {
    
    static int partition(int arr[], int low, int high) {
        
        int pivot = arr[low];
        
        int i = low-1; int j = high+1;
        
        while (true) {
            
            do {
                i++;
            } while (arr[i]<=pivot);
            
            do {
                j--;
            } while (arr[j]>pivot);
            
            if (i>=j) return j;
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {5, 3, 8, 4, 2, 7, 1, 10, 5};
        
        System.out.println(partition(arr, 0, arr.length-1));
        
        for (int element : arr) System.out.print(element + " ");
    }

}
