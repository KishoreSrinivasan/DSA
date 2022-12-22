package com.problem.sort.partition;

public class NaivePartition {
    
    // for a given array an index will be given using that we have to arrange an array in a way that 
          // all the element less than or equal to the given index value should come first and 
                 // remaining in second half
    
    static void partition(int arr[], int index) {
        
        int high = arr.length -1;
        int low = 0;
        
        int[] temp = new int[high-low+1];
        int pos = 0;
        
        for (int i = low; i<=high; i++) {
            
            if (arr[i] <= arr[index]) {
                
                temp[pos] = arr[i];
                pos++;
            }
        }
        
        for (int i = low; i <= high; i++) {

            if (arr[i] > arr[index]) {

                temp[pos] = arr[i];
                pos++;
            }
        }
        
        int i = 0;
        for (int element : temp) {
            
            arr[i] = element;
            i++;
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {5, 18, 6, 9, 12, 11, 8};
        int index = 6;
        
        partition(arr, index);
        
        for (int element : arr) System.out.print(element + " ");
    }

}
