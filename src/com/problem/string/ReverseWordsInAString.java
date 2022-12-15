package com.problem.string;

// Medium --> using stack also can be solved --> multiple ways can be solved
public class ReverseWordsInAString {
    
    public static String reverseWords(String s) {

        int start = 0;
        int end = -1;

        String result = "";

        int i = 0;
        for (; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {

                if (start == end) {

                    result = s.substring(start, i) + " " + result;
                    start = i + 1;
                    end = i;
                } else {

                    if (start < end) {

                        result = s.substring(start, i) + " " + result;
                        start = i + 1;
                        end = i;

                    } else {

                        end = i;
                        start = i + 1;
                    }
                }
            } else
                end++;
        }

        result = s.substring(start, i) + " " + result;

        return result.trim();
    }

    public static void main(String[] args) {
       
        // String --> "the sky is blue" : Reverse string --> "blue is sky the"
        
        System.out.println(ReverseWordsInAString.reverseWords("the sky is blue"));
    }

}
