package com.tutort.basic;

public class PrintArrayIsPerfectOrNot {
	
	static void isPerfect(int[] arr, int n) {
		
		int low = 0;
		int high = n-1;
		
		while (low<high) {
			
			if (arr[low] != arr[high]) {
				
				System.out.println("Not Perfect");
				return;
			}
			
			low++;
			high--;
		}
		
		System.out.println("Perfect");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input1 = {1, 2, 3, 2, 1};
		
		isPerfect(input1, input1.length);
		
		int[] input2 = {1, 2, 3, 4, 5};
		
		isPerfect(input2, input2.length);
	}

}
