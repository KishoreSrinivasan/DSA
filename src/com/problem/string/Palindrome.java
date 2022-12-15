package com.problem.string;

public class Palindrome {
    
    public static int isPalindrome(String S) {
        // code here
        int low = 0;
        int high = S.length() - 1;
        
        while (low < high) {
            
            if (S.charAt(low) == S.charAt(high)) {
                
                low++;
                high--;
                continue;
            }
            
            return 0;
        }
        
        return 1;
    }

    public static void main(String[] args) {

        String input = "level";
        
        var result = Palindrome.isPalindrome(input);
        
        if (result == 1) System.out.print(true);
        else System.out.print(false);
    }

}
