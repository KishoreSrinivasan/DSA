package com.problem.string;

// Basic
public class StringRotationOfAnotherString {

    public static boolean areRotations(String s1, String s2) {
        
        // Your code here
        if (s1.length() != s2.length())
            return false;

        if (s1.length() == 1)
            return s1.contains(s2);

        for (int i = 1; i < s2.length(); i++) {

            if (s1.contains(s2.substring(0, i)))
                continue;
            else {

                if (s1.contains(s2.substring(i - 1)))
                    return true;
                return false;
            }
        }

        return true;
    }
    
    public static void main(String args[]) {
        
        String s1 = "GeeksforGeeks";
        String s2 = "forGeeksGeeks";
        
        // Explanation
        // s2 is rotation of s1 forGeeks - Geeks
        
        
        System.out.print(StringRotationOfAnotherString.areRotations(s1, s2));
    }
}
