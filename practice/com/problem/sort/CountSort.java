package com.problem.sort;

public class CountSort {
	
	static void sort(int arr[]) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i=0; i<arr.length; i++) {
			
			max = Math.max(max,  arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		int[] count = new int[max-min+1];
		
		for (int i=0; i<arr.length; i++) {
			
			count[arr[i]-min] = count[arr[i]-min] + 1;			
		}
		
		int index = 0;
		for (int i=min; i<=max; i++) {
			
			int value = count[i-min];
			
			for (int j=0; j<value; j++) {
				
				arr[index] = i;
				index++;
			}
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 30, 40, 2, 1, 3, 8, 44, 6, 6, 7, 8, 22, -1};
		
		sort(arr);
		
		for (int element : arr) 
			System.out.print(element + " ");
	}

}
