package com.tutort.basic.pattern;

/*

 * * * * *
 * * * *
 * * *
 * *
 * 

*/

public class PatternFive {
	
	static void print(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (j < n-i)
					System.out.print("*" + " ");
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
