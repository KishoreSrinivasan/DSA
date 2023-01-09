package com.tutort.basic;

public class BalancedArray {
	
	static int balanced(int arr[], int n) {
		
		int mid;
		int sum1 = 0;
		int sum2 = 0;
		
		if (n%2==0) mid = n/2 - 1;
		else mid = n/2;
		
		for (int i=0; i<=mid; i++) {
			
			sum1 = sum1 + arr[i];
		}
		
		for (int i= mid+1; i<n; i++) {
			
			sum2 = sum2 + arr[i];
		}
		
		return Math.abs(sum1-sum2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input1 = {1, 5, 3, 2};
		
		System.out.println(balanced(input1, input1.length));
		
		int[] input2 = { 1, 2, 1, 2, 1, 3 };
		
		System.out.println(balanced(input2, input2.length));
	}

}
