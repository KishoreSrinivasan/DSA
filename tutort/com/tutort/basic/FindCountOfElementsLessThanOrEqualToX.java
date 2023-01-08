package com.tutort.basic;

public class FindCountOfElementsLessThanOrEqualToX {
	
	static int findTheCount(int[] arr, int n, int x) {
		
		int count = 0;
		
		for (int i=0; i<n; i++) {
			
			if (arr[i]<=x) {
				
				count++;
			} else {
				break;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input1 = {1, 2, 4, 5, 8, 10};
		
		System.out.println(findTheCount(input1, input1.length, 9));
		
		int[] input2 = {1, 2, 2, 2, 5, 7, 9};
		
		System.out.println(findTheCount(input2, input2.length, 2));

	}

}
