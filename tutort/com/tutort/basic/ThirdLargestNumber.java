package com.tutort.basic;

public class ThirdLargestNumber {
	
	public static int thirdMax(int[] nums) {
        
        if(nums.length == 0) return -1;
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        boolean flag = false;

        for (int i=0; i<nums.length; i++) {
        	
        	if (nums[i] == Integer.MIN_VALUE) flag = true;

            if (nums[i] == first || nums[i] == second || nums[i] == third) 
                continue;

            if (nums[i] > first) {

                third = second;
                second = first;
                first = nums[i];

            } else if (nums[i] > second) {

                third = second;
                second = nums[i];

            } else if (nums[i] > third) {

                third = nums[i];
            }
        }

        if (third == Integer.MIN_VALUE && flag != true) return first;

        return third;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr  = {1, 2, -2147483648};
		System.out.println(thirdMax(arr));
	}

}
