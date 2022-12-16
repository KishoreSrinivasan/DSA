package com.problem.string;

// Easy
public class ReverseStringII {

    static public String reverseStr(String s, int k) {

        char[] charArray = s.toCharArray();

        int length = s.length();
        int count = 1;

        int nextIndex = 0;

        while (nextIndex < length) {

            int start = nextIndex;
            int end = nextIndex + k - 1;

            if (end < length) {

                swap(start, end, charArray);
            } else {

                swap(start, length - 1, charArray);
            }
            
            nextIndex = count * (2 * k);
            count++;
        }

        return new String(charArray);
    }

    static private void swap (int start, int end, char[] charArray) {

        while (start<end) {
            
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            end--;
            start++;
        }
    }
    
    public static void main(String[] args) {
        
        // Swap every k char in 2k char if final block char is less that or equal to k swap all
        // String : abcdefg, k : 2
        // optput : bacdfeg  -->  ab(k char) -> ba -> bacd (2k char) -> fe(k char) -> bacdfeg 
        System.out.println(reverseStr("abcdefg", 2));
    }

}
