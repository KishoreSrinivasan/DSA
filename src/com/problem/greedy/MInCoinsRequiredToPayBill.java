package com.problem.greedy;

import java.util.Arrays;

public class MInCoinsRequiredToPayBill {
    
    static int optimise(int[] arr, int value) {
        
        Arrays.sort(arr);
        
        int res = 0;
        
        for (int i=arr.length-1; i>=0; i--) {
            
            if (arr[i] <= value) {
                
                int coins = Math.floorDiv(value, arr[i]);
                value = value%arr[i];
                
                res = res + coins;
            }
            
            if (value == 0) break;
        }
        
        return res;
    }

    public static void main(String[] args) {
        
        int arr[] = {10, 2, 1, 5};
        int value = 20;
        
        System.out.println(optimise(arr, value));

    }

}
