package com.problem.greedy;

public class LargestNumberWithGivenSum {
    
    static String largestNumber(int n, int sum) {
        
        // add your code here
        int result[] = new int[n];
        int value = 9;

        for (int i = 0; i < n;) {

            if (value <= sum) {

                result[i] = value;
                sum = sum - value;
                i++;
            } else
                value--;

            if (sum == 0)
                break;
        }

        if (sum > 0)
            return "-1";

        StringBuilder res = new StringBuilder();
        for (int element : result)
            res.append(element);

        return res.toString();
    }

    public static void main(String[] args) {
        
        // largest number for the given sum and n(number of digits)
        // n = 1, sum = 44 -> -1
        // n = 5, sum = 12 -> 93000
        
        System.out.print(largestNumber(5, 12));
    }

}
