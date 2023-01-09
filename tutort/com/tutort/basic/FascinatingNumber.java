package com.tutort.basic;

public class FascinatingNumber {
	
	static void isFacinating(int n) {
		
		if (n<=99) {
			
			System.out.println("Not Fascinating");
			return;
		}
		
		String str = n + "" + n*2 + "" + n*3;
		long con = Long.valueOf(str);
		
		int[] arr  = new int[10];
		
		while (con>0) {
			
			long value = con%10;
			arr[(int)value] = 1;
			
			con = con/10;
		}
		
		
		for (int i=1; i<10; i++) {
			
			if (arr[i] != 1) {
				
				System.out.println("Not Fascinating");
				return;
			}
		}
		
		System.out.println("Fascinating");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isFacinating(192);
		
		isFacinating(853);
	}

}
