package com.tutort.basic;

public class FindTheLastElement {
	
	static int findTheElement(int arr[], int n) {

		for (int i = n; i >= 0; i--) {

			for (int j = 0; j < i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		int mid;
		
		if (n%2==0) mid = n/2 -1;
		else mid = n/2;
		
		return arr[mid];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input1 = {7, 8, 3, 4, 2, 9, 5};
		
		System.out.println(findTheElement(input1, input1.length));
		
		int[] input2 = {8, 1, 2, 9, 4, 3, 7, 5};
		
		System.out.println(findTheElement(input2, input2.length));
	}

}
