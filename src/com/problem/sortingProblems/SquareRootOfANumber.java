package com.problem.sortingProblems;

public class SquareRootOfANumber {
    
    static long floorSqrt(long x) {
        
        long low = 1; 
        long high = x;
        long ans = -1;
        
        while (low<=high) {
            
            long mid = (low+high)/2;
            long midSq = mid * mid;
            
            if (midSq==x) return mid;
            else if (midSq>x) high = mid-1;
            else {
                
                low = mid+1;
                ans = mid;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        
        System.out.println(floorSqrt(5));
    }

}
