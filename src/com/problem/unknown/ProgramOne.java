package com.problem.unknown;

// Need to debug
public class ProgramOne {
    
    static int count(int n) {
        
        int count = 1;
        
        int currentStart = 1;
        int next = 1;
        int plus = currentStart + currentStart;
        int noOfCount = 1;
        
        while (noOfCount < n-1) {
            
            next = next + plus;
            count = count + next;
            noOfCount++;
            
            if (noOfCount == n-1) return count;
            
            if ((next+plus) > n) {
                
                next = plus;
                noOfCount++;
                count = count + next;
                plus = next + next;
            }
        }        
        
        return count;
    }

    public static void main(String[] args) {
        
        System.out.print(count(5000));

    }
}
