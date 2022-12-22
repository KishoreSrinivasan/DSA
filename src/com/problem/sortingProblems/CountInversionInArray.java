package com.problem.sortingProblems;

public class CountInversionInArray {
    
    // inverstion condition i<j : arr[i] > arr[j]
    
    // some modification on Merge sort 
    static int merge(int[] arr, int left, int center, int right) {
        // change in return

        int leftArraySize = center - left + 1;
        int rightArraySize = right - center;

        int leftArray[] = new int[leftArraySize];
        int rightArray[] = new int[rightArraySize];

        for (int i = left, index = 0; i <= center; i++, index++) {

            leftArray[index] = arr[i];
        }

        for (int i = center + 1, index = 0; i <= right; i++, index++) {

            rightArray[index] = arr[i];
        }

        int leftIndex = 0;
        int rightIndex = 0;
        int insertIndex = left;
        // varaible to maintaine count
        int result = 0;

        while (leftIndex < leftArraySize && rightIndex < rightArraySize) {

            if (leftArray[leftIndex] <= rightArray[rightIndex]) {

                arr[insertIndex] = leftArray[leftIndex];
                insertIndex++;
                leftIndex++;

            } else {

                arr[insertIndex] = rightArray[rightIndex];
                insertIndex++;
                rightIndex++;
                // this is to count
                result = result + (leftArraySize - leftIndex);
            }
        }

        while (leftIndex < leftArraySize) {

            arr[insertIndex] = leftArray[leftIndex];
            insertIndex++;
            leftIndex++;
        }

        while (rightIndex < rightArraySize) {

            arr[insertIndex] = rightArray[rightIndex];
            insertIndex++;
            rightIndex++;
        }
        
        return result;
    }
    
    static public int sort(int arr[], int left, int right) {
        
        int res = 0;
        
        // changes here to
        if (left<right) {
            
            int mid = left + (right - left)/2;
            
            res = res + sort(arr, left, mid);
            res = res + sort(arr, mid+1, right);
            res = res + merge(arr, left, mid, right);
        }
        
        return res;
    }

    public static void main(String[] args) {
        
        int[] input = { 5, 6, 2, 1, 8, 4, 6, 5, 9, 0, 1, 4, 3, 7, 8, 7 };

        System.out.print(sort(input, 0, input.length - 1));
    }

}
