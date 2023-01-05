package com.problem.string;

// Medium
public class StringIsSuffledSubstringOfAnother {

    public static boolean isShuffledSubString(String A, String B) {
        
        int NO_OF_CHAR = 256;
        
        int[] frequency = new int[NO_OF_CHAR];
        
        for (char element : B.toCharArray()) {
            
            frequency[(int) element]++;
        }
        
        for (char element : A.toCharArray()) {
            
            frequency[(int) element]--;
            
            if (frequency[(int) element] < 0) return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        
        // from the given string A and B check A is present in B in shuffled form
        // example 
        // A : onetwofour, B : hellofourtwooneworld
        // output : true
              // str2 = “hello” + “fourtwoone” + “world” 
              // str2 = “hello” + str1 + “world”, where str1 = “fourtwoone” (shuffled form) 
        
        String A = "roseyellow";
        String B = "yellow";
        
        System.out.println(StringIsSuffledSubstringOfAnother.isShuffledSubString(A, B));
    }

}
