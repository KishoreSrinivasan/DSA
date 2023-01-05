package com.problem.matrix;

import java.util.ArrayList;

// Easy
public class PrintMatrixInSnakePattern {
    
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i=0; i<matrix.length; i++) {
            
            if (i%2 == 0) {
                
                for(int j=0; j<matrix[i].length; j++) 
                      result.add(matrix[i][j]);
                
            } else {
                
                for(int j=matrix[i].length-1; j>=0; j--) 
                      result.add(matrix[i][j]);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        int matrix[][] = {{1, 2, 3, 4},
                          {8, 7, 6, 5},
                          {9, 10, 11, 12},
                          {16, 15, 14, 13}};
        
        System.out.println(snakePattern(matrix));
    }

}
