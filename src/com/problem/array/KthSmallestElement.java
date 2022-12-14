package com.problem.array;

// Medium
public class KthSmallestElement {
	
	public static void sort(int[] arr, int left, int right) {
		
		if (left < right) {
			
			int mid = left + (right - left)/2;
			
			sort(arr, left, mid);
			sort(arr, mid+1, right);
			
			merge(arr, left, mid, right);
		}
	}
	
	// merge two sorted array
	public static void merge(int[] arr, int left, int mid, int right) {
		
		int leftArraySize = mid - left +1;
		int rightArraySize = right - mid;
		
		int leftArray[] = new int[leftArraySize];
		int rightArray[] = new int[rightArraySize];
		
		for (int i=0; i<leftArraySize; i++) 
			leftArray[i] = arr[left + i];
		
		for (int i=0; i<rightArraySize; i++) 
			rightArray[i] = arr[mid + 1 + i];
		
		int i = 0;
		int j = 0;
		int k = left;
		
		while (i<leftArraySize && j<rightArraySize) {
			
			if (leftArray[i] < rightArray[j]) {
				
				arr[k] = leftArray[i];
				k++;
				i++;
				
			} else {
				
				arr[k] = rightArray[j];
				k++;
				j++;
			}
		}
		
		while (i<leftArraySize) {
			
			arr[k] = leftArray[i];
			k++;
			i++;
		}
		
		while (j < rightArraySize) {

			arr[k] = rightArray[j];
			k++;
			j++;
		}
	}

	public static void main(String[] args) {
		
		// From a given array find the Kth Smallest element
		// example : 
        // array = 7, 10, 4, 3, 20, 15
		// k = 3
		// output : 7
		
		int arr[] = {7, 10, 4, 3, 20, 15};
		int k = 3;
		
		KthSmallestElement.sort(arr, 0, arr.length-1);
		
		System.out.println(arr[k-1]);
	}

}
