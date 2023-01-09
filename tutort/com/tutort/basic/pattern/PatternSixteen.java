package com.tutort.basic.pattern;

/*

A             
B B           
C C C         
D D D D       
E E E E E     
F F F F F F   
G G G G G G G 

*/
public class PatternSixteen {

	static void print(int n) {

		int count = 65;
		
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (j <= i)
					System.out.print((char) count + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
			count++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print(7);
	}

}
