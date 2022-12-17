package com.problem.sort;

// Medium
public class MergeSort {

    // main logic for splitting the array to individual element
    static void mergeSort(int arr[], int l, int r) {

        // code here
        if (l < r) {

            int c = l + (r - l) / 2;

            mergeSort(arr, l, c);
            mergeSort(arr, c + 1, r);

            merge(arr, l, c, r);
        }

    }

    // merge two sorted array logic
    static void merge(int[] arr, int left, int center, int right) {

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

        while (leftIndex < leftArraySize && rightIndex < rightArraySize) {

            if (leftArray[leftIndex] < rightArray[rightIndex]) {

                arr[insertIndex] = leftArray[leftIndex];
                insertIndex++;
                leftIndex++;

            } else {

                arr[insertIndex] = rightArray[rightIndex];
                insertIndex++;
                rightIndex++;
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
    }

    public static void main(String args[]) {
        
        int[] input = {5, 6, 2, 1, 8, 4, 6, 5, 9, 0, 1, 4, 3, 7, 8, 7};
        
        MergeSort.mergeSort(input, 0, input.length - 1);
        
        for (int element : input) {
            
            System.out.print( element +  " ");
        }
    }
}
