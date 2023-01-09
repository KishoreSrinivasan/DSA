package com.tutort.basic.pattern;

/*

1             
2 3           
4 5 6         
7 8 9 10       
11 12 13 14 15     
16 17 18 19 20 21   
22 23 24 25 26 27 28 

*/

public class PatternThirteen {
	
	static void print(int n) {
		
		int count = 1;
		
		for (int i=0; i<n; i++) {
			
			for (int j=0; j<n; j++) {
				
				if (j<=i) System.out.print(count++ + " ");
				else System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print(7);
	}

}
