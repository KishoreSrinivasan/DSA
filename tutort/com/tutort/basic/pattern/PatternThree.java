package com.tutort.basic.pattern;

/*

 1 
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5

*/

public class PatternThree {

	static void print(int n) {

		for (int i = 0; i < n; i++) {
			
			int count = 1;

			for (int j = 0; j < n; j++) {

				if (j<=i) 
					System.out.print(count++ + " ");
				else 
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print(7);
	}
}
