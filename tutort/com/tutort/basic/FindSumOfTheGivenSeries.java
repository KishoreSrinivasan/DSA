package com.tutort.basic;

public class FindSumOfTheGivenSeries {
	
	static int findTheGivenSeries(int n) {
		
		int sum = 0;
		
		for (int i=1; i<=n; i++) {
			
			sum = sum + i;
		}
		
		return sum;
	}
	
	static int findSumGivenSeries(int n) {

		return (n*(n+1))/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findTheGivenSeries(1));
		
		System.out.println(findSumGivenSeries(5));
	}

}
