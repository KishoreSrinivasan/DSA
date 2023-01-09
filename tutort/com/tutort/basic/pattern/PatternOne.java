package com.tutort.basic.pattern;

/*

 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *

*/
public class PatternOne {
	
	static void print(int row, int column) {
		
		for (int i=0; i<row; i++) {
			
			for (int j=0; j<column; j++) {
				
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print(3, 4);
	}

}
