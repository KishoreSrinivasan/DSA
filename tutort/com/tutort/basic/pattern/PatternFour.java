package com.tutort.basic.pattern;

/*

1 
2 2
3 3 3
4 4 4 4
5 5 5 5

*/

public class PatternFour {

	static void print(int n) {
		
		int count = 1;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (j <= i)
					System.out.print(count + " ");
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
