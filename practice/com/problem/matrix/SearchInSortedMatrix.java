package com.problem.matrix;

public class SearchInSortedMatrix {
    
    static boolean search(int matrix[][], int n, int m, int x)  {  
        // code here
        int i =0; int j = m-1;
        while (i<n && j>=0) {
            
            if (matrix[i][j] == x) return true;
            
            if (matrix[i][j]>x) j--;
            else i++;
        }
        
        return false;
    }

    public static void main(String[] args) {

        int n = 3;
        int m = 3; 
        int x = 62;
        int matrix[][] = {{ 3, 30, 38},
                              {36, 43, 60},
                              {40, 51, 69}};
        
        System.out.println(SearchInSortedMatrix.search(matrix, n, m, x));
    }

}
