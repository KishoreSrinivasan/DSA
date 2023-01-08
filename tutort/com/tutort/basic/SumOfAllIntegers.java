package com.tutort.basic;

public class SumOfAllIntegers {
	
	static int sumofArray(int arr[], int n) {
		
		int sum = 0;
		
		for (int i=0; i<n; i++) {
			
			sum = sum + arr[i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input1 = {1, 2, 3, 4};
		
		System.out.println(sumofArray(input1, input1.length));
		
		int[] input2 = {5, 8, 3, 10, 22, 45};
		
		System.out.println(sumofArray(input2, input2.length));
	}

}
