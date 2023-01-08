package com.tutort.basic;

public class PrintElementEqualToIndex {
	
	static void print(int[] arr, int n) {
	
		for (int i=0; i<n; i++) {
			
			if (arr[i]==(i+1))
				System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input1 = {15, 2, 45, 12, 7};
		
		print(input1, input1.length);
		
		int[] input2 = {1};
		
		print(input2, input2.length);
	}

}
