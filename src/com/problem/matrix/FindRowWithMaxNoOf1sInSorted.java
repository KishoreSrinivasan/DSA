package com.problem.matrix;

// fidn the maximum row with value 1 -- row is sorted
//used binary serach for finding the start
public class FindRowWithMaxNoOf1sInSorted {
    
    static int maxRow(int arr[][]) {
        
        int prevValue = -1;
        int maxRow = -1;
        for (int i=0; i<arr.length; i++) {
            
            int start = findStart(arr[i], 0, arr[i].length-1);
            
            if (start != -1) {
                
                int value = arr[i].length - start;
                
                if (prevValue<value) {
                    maxRow = i;
                    prevValue = value;
                }
            }
        }
        
        return maxRow;
    }
    
    static int findStart(int arr[], int low, int high) {
        
        if (low<=high) {
            
            int mid = low + (high - low) / 2;
            
            if (mid==0 && arr[mid]==1) return mid;
            else if (arr[mid] == 1 && arr[mid-1] == 0) return mid;
            
            if (arr[mid] == 0) {
                
                return findStart(arr, mid +1, high);
                
            } else return findStart(arr, low, mid-1);
        }
        
        return -1;
    }

    public static void main(String[] args) {
        
        int[][] matrix = { {0, 1, 1, 1},
                           {0, 0, 1, 1},
                           {1, 1, 1, 1},
                           {0, 0, 0, 0}};
        
        System.out.print(maxRow(matrix));
    }

}
