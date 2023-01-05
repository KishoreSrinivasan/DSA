package com.problem.array;

public class MinNoOfMergeToMakePalindrome {
    
    /*
     Given an array of positive integers. We need to make the given array a ‘Palindrome’. 
     The only allowed operation is”merging” (of two adjacent elements). 
     Merging two adjacent elements means replacing them with their sum. 
     The task is to find the minimum number of merge operations required to make the given array a ‘Palindrome’.

     To make any array a palindrome, we can simply apply merge operation n-1 times 
     where n is the size of the array (because a single-element array is always palindromic, 
     similar to single-character string). In that case, the size of array will be reduced to 1. 
     But in this problem, we are asked to do it in the minimum number of operations.
     */
    
    // slight modification on reverse of array
    static int minOperations(int arr[]) {
        
        int minOperationCount = 0;
        
        int low = 0;
        int high = arr.length-1;
        
        while (low<high) {
            
            if (arr[low] == arr[high]) {
               
                low++;
                high--;
                
            } else if (arr[low] < arr[high]) {
                
                low++;
                arr[low] = arr[low-1] + arr[low];
                minOperationCount++;
                
            } else {
                
                high--;
                arr[high] = arr[high+1] + arr[high];
                minOperationCount++;
            }
        }
        
        return minOperationCount;        
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        // for arr : 11, 14, 15, 99 the reverse will be 99, 15, 14, 11 so it's not palindrome so we are merging all
        
        int arr[] = {11, 14, 15, 99};    
//        int arr[] = {15, 4, 15};
        
        System.out.print(MinNoOfMergeToMakePalindrome.minOperations(arr));
    }

}
