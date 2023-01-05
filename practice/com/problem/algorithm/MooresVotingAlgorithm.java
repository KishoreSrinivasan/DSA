package com.problem.algorithm;

public class MooresVotingAlgorithm {
    
    
    static void getMajority(int arr[]) {
        
        int candidate = findMajority(arr);
        
        if (isMajority(candidate, arr)) 
            System.out.println(candidate);
        else
            System.out.println("No Majority");
    }
    
    static int findMajority(int arr[]) {
        
        int majIndex = 0;
        int count = 1;
        
        for (int i=1; i<arr.length; i++) {
            
            if (arr[majIndex] == arr[i]) {
                
                count++;
            } else {
                
                count--;
                
                if (count==0) {
                    
                    majIndex = i;
                    count = 1;
                }
            }
        }
        
        return arr[majIndex];
    }
    
    static boolean isMajority(int candidate, int arr[]) {
        
        int count = 0;
        
        for (int i=0; i<arr.length; i++) {
            
            if (arr[i] == candidate) count++;
        }
        
        if (count>(arr.length/2)) return true;
        
        return false;
    }

    public static void main(String[] args) {
        
        int arr[] = {2, 2, 3, 4, 5, 2, 5, 2, 2, 2, 6};
        
        getMajority(arr);
    }

}
