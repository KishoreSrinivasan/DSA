package com.problem.sortingProblems;

public class MinSwapRequiredToSortArray {
	
	static int minSwapToSortArray(int[] arr) {
		
		int result = 0;
		int n = arr.length;		
				
		for (int cs=0; cs<n; cs++) {
			
			int item = arr[cs];
			int pos = cs;
			
			for (int i=cs+1; i<n; i++) {
				
				if (arr[i]<item) pos++;
			}
			
			int temp1 = arr[pos];
			arr[pos] = item;
			item = temp1;
			
			while (pos != cs) {
				
				result++;
				pos = cs;
				
				for (int i=cs+1; i<n; i++) {
					
					if (arr[i]<item) pos++;
				}
				
				int temp2 = arr[pos];
				arr[pos] = item;
				item = temp2;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 20, 40, 50, 10, 30 };

		System.out.println(minSwapToSortArray(arr));

		for (int elemnt : arr) {

			System.out.print(elemnt + " ");
		}
	}

}
