package com.tutort.basic;

public class PrintElementAtGivenIndex {
	
	static int print(int[] arr, int k) {
		
		if (k<arr.length) return arr[k];
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input1 = {10, 20, 30, 40, 50};
		
		System.out.println(print(input1, 2));
		
		int[] input2 = {10, 20, 30, 40, 50, 60, 70};
		
		System.out.println(print(input2, 4));
	}

}
