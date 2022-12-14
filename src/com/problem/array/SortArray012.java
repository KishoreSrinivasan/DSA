package com.problem.array;

public class SortArray012 {
    
    public static void sort012(int a[], int n)
    {
        // Sorting the array using Three pointer
        // low for next 0 position
        int low = 0;
        int mid = 0;
        
        // high for next 2 position
        int high = n-1;
        
        while (mid <= high) {
            
            if (a[mid] == 0) {
                
                // if mid is 0 swap mid and low increment both
                int temp = a[low];
                a[low] = 0;
                a[mid] = temp;
                low++;
                mid++;
                
            } else if (a[mid] ==  2) {
                
                // if mid is 2 swap mid and high decrement high
                int temp = a[high];
                a[high] = 2;
                a[mid] = temp;
                high--;
                
            } else mid++;
        }
    }

    public static void main(String[] args) {
        
        // sort 0 1 2 in increamnt order
        // example 
        // arr = 0, 2, 1, 2, 0
        // output : 0, 0, 1, 2, 2
        int arr[]= {0, 2, 1, 2, 0};
        
        SortArray012.sort012(arr, arr.length);
        
        for (int i=0; i<arr.length; i++) {
            
            System.out.print(arr[i] + " ");
        }
    }

}
