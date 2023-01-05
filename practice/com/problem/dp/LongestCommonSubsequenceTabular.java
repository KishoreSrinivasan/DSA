package com.problem.dp;

public class LongestCommonSubsequenceTabular {

    static int[][] table;

    static int lcs(String s1, String s2, int m, int n) {

        for (int i=1; i<=m; i++) {
            
            for (int j=1; j<=n; j++) {
                
                if (s1.charAt(i-1) == s2.charAt(j-1))
                    table[i][j] = 1+table[i-1][j-1];
                else 
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
            }
        }
        
        return table[m][n];
    }

    public static void main(String[] args) {

        String s1 = "ABC";
        String s2 = "ACD";

        table = new int[s1.length() + 1][s2.length() + 1];

        System.out.println(lcs(s1, s2, s1.length(), s2.length()));
    }
}
