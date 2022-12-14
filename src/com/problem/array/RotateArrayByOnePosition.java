package com.problem.array;

// Basic
public class RotateArrayByOnePosition {
    
    public static void rotate(int arr[], int n) {
        
        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--)
            arr[i] = arr[i - 1];

        arr[0] = temp;
    }

    public static void main(String[] args) {
        
        // Rotate the array by one position in cyclic order
        // example 
        // A[] = {1, 2, 3, 4, 5}
        // output : 5, 1, 2, 3, 4
        
        int arr[] = {1, 2, 3, 4, 5};
        
        RotateArrayByOnePosition.rotate(arr, arr.length);
        
        for (int element : arr)
            System.out.print(element + " ");
    }

}
