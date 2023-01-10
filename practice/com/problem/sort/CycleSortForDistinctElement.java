package com.problem.sort;

public class CycleSortForDistinctElement {
	
	static void sort(int arr[]) {
		
		int n = arr.length;
		
		for (int cs = 0; cs<n; cs++) {
			
			int item = arr[cs];
			int pos = cs;
			
			for (int i=cs+1; i<n; i++) {
				
				if (item>arr[i]) pos++;
			}
			
			int temp = arr[pos];
			arr[pos] = item;
			item = temp;
			
			while (pos!=cs) {
				
				pos = cs;
				
				for (int i=cs+1; i<n; i++) {
					
					if (item>arr[i]) pos++;
				}
				
				int temp2 = arr[pos];
				arr[pos] = item;
				item = temp2;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {20, 40, 50, 10, 30};
		
		sort(arr);
		
		for (int elemnt : arr) {
			
			System.out.print(elemnt + " ");
		}
	}

}
