package com.problem.array;

// Easy - DSA Sheet
public class ReverseTheArray {
    
    public static void reverse(int[] arr, int n) {
        
        int low = 0;
        int high = n-1;
        
        while (low < high) {
            
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        
        ReverseTheArray.reverse(arr, arr.length);
        
        for (int element : arr) 
            System.out.print(element + " ");
    }

}
