package com.tutort.basic;

public class PrintAllExceptTwoGreatest {
	
	static void print(int arr[], int n) {
		
		for (int i=n; i>=0; i--) {
			
			for (int j=0; j<i-1; j++) {
				
				if (arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i=0; i<n-2; i++) {
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input1 = {2, 8, 7, 1, 5};
		
		print(input1, input1.length);
		
		int[] input2 = {7, -2, 3, 4, 9, -1};
		
		print(input2, input2.length);
	}

}
