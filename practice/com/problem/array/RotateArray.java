package com.problem.array;

public class RotateArray {
    
    static public void rotate(int[] nums, int k) {

        if (k>nums.length) k = k-nums.length;

        swap(nums, nums.length-k, nums.length-1);
        swap(nums, 0, nums.length-k-1);
        swap(nums, 0, nums.length-1);
    }

    static void swap(int[] nums, int start, int end) {

        while (start>=0 && start<end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String args[]) {
        
        int[] arr = {1, 2, 3};
        
        RotateArray.rotate(arr, 4);
        
        for (int element: arr) System.out.print(element +  " ");
    }
}
