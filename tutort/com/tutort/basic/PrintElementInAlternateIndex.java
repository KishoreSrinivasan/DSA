package com.tutort.basic;

public class PrintElementInAlternateIndex {
	
	static void print(int[] arr, int n) {
		
		for (int i=0; i<n; i = i+2) {
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input1 = {1, 2, 3, 4};
		
		print(input1, input1.length);
		
		int[] input2 = {1, 2, 3, 4, 5};
		
		print(input2, input2.length);
	}

}
