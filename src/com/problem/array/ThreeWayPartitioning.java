package com.problem.array;

public class ThreeWayPartitioning {
    
/*
Given an array of size n and a range [a, b]. 
The task is to partition the array around the range such that array is divided into three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are required to return the modified array.

 */
    
    // using the technique sort array 0 1 2
    public static void threeWayPartition(int array[], int a, int b) {
        // code here
        int low =0;
        int high = array.length-1;
        
        for (int i=0; i<=high; ) {
            
            if (array[i] < a) {
                
                int temp = array[low];
                array[low] = array[i];
                array[i] = temp;
                low++;
                i++;
                
            } else if (array[i] > b) {
                
                int temp = array[i];
                array[i] = array[high];
                array[high] = temp;
                high--;
                
            } else i++;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int A[] = {4, 1, 2, 3, 3, 5, 4, 6, 8};
        
        ThreeWayPartitioning.threeWayPartition(A, 2, 4);
        
        for (int element : A) System.out.print(element + " ");
    }

}
