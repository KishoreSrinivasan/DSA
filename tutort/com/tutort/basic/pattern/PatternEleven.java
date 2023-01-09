package com.tutort.basic.pattern;

/*

1          
0 1         
1 0 1        
0 1 0 1       
1 0 1 0 1      
0 1 0 1 0 1     
1 0 1 0 1 0 1    
0 1 0 1 0 1 0 1   
1 0 1 0 1 0 1 0 1  
0 1 0 1 0 1 0 1 0 1 

*/

public class PatternEleven {
	
	static void print(int n) {

		int flag = 1;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				
				if ((i%2) == 0 && j==0) flag = 1;

				if (j <= i) {
					System.out.print(flag + " ");
					flag = flag==1?0:1;
				}
				else
					System.out.print("" + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print(10);
	}

}
