package com.problem.string;

public class ReverseString {
    
    public static String reverseWord(String str) {
       
        // Reverse the string str
        String result = "";

        int high = str.length() - 1;

        while (high >= 0) {

            result = result + str.charAt(high);
            high--;
        }

        return result;
    }

    public static void main(String[] args) {

        String input = "Geeks";
        
        System.out.println(ReverseString.reverseWord(input));
    }
}
