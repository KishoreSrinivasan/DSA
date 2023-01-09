package com.tutort.basic.pattern;

/*

       *
     * * *
   * * * * *
 * * * * * * *

*/

public class PatternSeven {
	
	static void print(int n) {
		
		int primeNum = 1;
		for (int i=1; i<n; i++) {
			
			primeNum = primeNum+2;
		}
		
		int low = primeNum/2;
		int high = low;
		
		for (int i=0; i<n; i++) {
			
			for (int j=0; j<primeNum; j++) {
				
				if (j>=low && j<=high) System.out.print("*" + " ");
				else System.out.print(" " + " ");
			}
			System.out.println();
			low--;
			high++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print(5);
	}

}
