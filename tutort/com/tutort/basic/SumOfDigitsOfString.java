package com.tutort.basic;

public class SumOfDigitsOfString {
	
	public static int getLucky(String s, int k) {
        if(s == null || s.length() == 0) return -1;
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            int ch = s.charAt(i) - 'a' + 1;
            num += (ch /10 + ch % 10);
        }
        while(k > 1){
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num = num / 10;
            }
            k--;
            num = sum;
        }
        return num;
    }

	public static void main(String[] args) {
		
		String s = "iiii";
		
		System.out.println(getLucky(s, 2));
	}

}
