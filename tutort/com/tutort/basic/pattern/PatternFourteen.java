package com.tutort.basic.pattern;

/*

A             
A B           
A B C         
A B C D       
A B C D E     
A B C D E F   
A B C D E F G 

*/

public class PatternFourteen {

	static void print(int n) {

		for (int i = 0; i < n; i++) {
			
			int count = 65;

			for (int j = 0; j < n; j++) {

				if (j <= i)
					System.out.print((char) count++ + " ");
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
