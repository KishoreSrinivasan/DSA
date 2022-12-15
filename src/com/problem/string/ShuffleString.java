package com.problem.string;

// Easy
public class ShuffleString {
    
    public static String restoreString(String s, int[] indices) {

        char reArrangedArray[] = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {

            reArrangedArray[indices[i]] = s.charAt(i);
        }

        return new String(reArrangedArray);
    }

    public static void main(String[] args) {
       
        // for the given string and indices re-arrange the string to the original form 
        // example 
        // string : codeleet , indices : 4, 5, 6, 7, 0, 2, 1, 3
             // 4, 5, 6, 7, 0, 2, 1, 3
             // c, o, d, e, l, e, e, t
        // output : leetCode
        
        String input = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        
        System.out.println(ShuffleString.restoreString(input, indices));
    }

}
