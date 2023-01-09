package com.tutort.basic.pattern;

/*

 * 
 * *
 * * *
 * * * *
 * * * * *

*/
public class PatternTwo {
	
	static void print(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (j<=i) 
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
