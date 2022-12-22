package com.problem.sort;

public class QuickSortUsingHoarePartition {
    
    static int partition(int arr[], int low, int high) {

        int pivot = arr[low];

        int i = low - 1;
        int j = high + 1;

        while (true) {

            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j)
                return j;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    static void sort(int arr[], int low, int high) {

        if (low < high) {

            int part = partition(arr, low, high);
            sort(arr, low, part);
            sort(arr, part + 1, high);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 4, 6, 9, 1, 5, 3, 5, 4, 2, 7, 8 };

        sort(arr, 0, arr.length - 1);

        for (int element : arr)
            System.out.print(element + " ");
    }

}
