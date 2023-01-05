package com.problem.array;

// Hard - DSA Sheet (without extra space)
public class MedianOfTwoSortedArray {
    
    /*
     Given two sorted arrays, a[] and b[], the task is to find the median of these sorted arrays, 
     where N is the number of elements in the first array, and M is the number of elements in the second array. 

     This is an extension of median of two sorted arrays of equal size problem. 
     Here we handle arrays of unequal size also.

     Examples: 

     Input: a[] = {-5, 3, 6, 12, 15}, b[] = {-12, -10, -6, -3, 4, 10}
     Output: The median is 3.
     Explanation: The merged array is: ar3[] = {-12, -10, -6, -5 , -3, 3, 4, 6, 10, 12, 15}.
     So the median of the merged array is 3
    */
    
    // slight modified merge to sorted array technique
    static int medianOfArrays(int a[], int b[], int n, int m) {

        // Your Code Here
        int m1 = -1;
        
        if ((m+n)%2 != 0) {
            
            int i=0;
            int j=0;
            
            for (int count=0; count<=((m+n)/2); count++) {
                
                if (i<n && j<m) {
                    
                    if (a[i] < b[j]) m1=a[i++];
                    else m1 = b[j++];
                    
                } else if (i<n) m1 = a[i++];
                else m1 = b[j++];
            }
            
            return m1;
            
        } else {
            
            int m2 = -1;
            
            int i=0;
            int j=0;
            
            for (int count=0; count<=(m+n)/2; count++) {
                
                m2 = m1;
                
                if (i<n && j<m) {
                    
                    if (a[i] < b[j]) m1=a[i++];
                    else m1 = b[j++];
                    
                } else if (i<n) m1 = a[i++];
                else m1 = b[j++];
            }
            
            return (m1+m2)/2;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int[] a = {1, 5, 9};
        int[] b = {2, 3, 6, 7};
        
        System.out.print(MedianOfTwoSortedArray.medianOfArrays(a, b, a.length, b.length));

    }

}
