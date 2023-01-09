package com.problem.dynamicprogramming;

public class FibonacciMemoization {

    int[] memo;

    FibonacciMemoization(int[] memo){
        this.memo = memo;
    }

    int fibonacci(int n) {
        
        if (memo[n] == 0) {
            
            if (n < 2) 
                memo[n] = n;
            else 
                memo[n] = fibonacci(n-1) + fibonacci( n-2);
        }

        return memo[n];
    }

    public static void main(String[] args) {
        
        int n = 6;
        System.out.println(new FibonacciMemoization(new int[n+1]).fibonacci(n));
    }

}
