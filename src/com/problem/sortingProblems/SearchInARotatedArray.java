package com.problem.sortingProblems;

public class SearchInARotatedArray {
    
    /*
    Given a sorted and rotated array A of N distinct elements which is rotated at some point, 
    and given an element key. The task is to find the index of the given element key in the array A.
    
    Time Complexity = O(log N)
    */
    
    static int search(int A[], int l, int h, int key) {
        
        if (l > h) {
            return -1;
        }

        int mid = (l + h) / 2;
        if (A[mid] == key) {
            return mid;
        }

        if (A[l] <= A[mid]) {
            if (key >= A[l] && key <= A[mid])
                return search(A, l, mid - 1, key);
            return search(A, mid + 1, h, key);
        }

        if (key >= A[mid] && key <= A[h])
            return search(A, mid + 1, h, key);
        return search(A, l, mid - 1, key);
    }
    
    public static void main(String[] args) {
        
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;
        
        System.out.print(search(arr, 0, arr.length-1, key));
    }

}
