package com.problem.matrix;

public class RowWithMinNumberOf1s {
    
    static int minRow(int N, int M, int A[][]) {
        
        // code here
        int min = Integer.MAX_VALUE;
        int row = -1;

        for (int i = 0; i < N; i++) {

            int count = 0;
            for (int j = 0; j < M; j++) {

                if (A[i][j] == 1)
                    count++;
            }

            if (count < min) {

                min = count;
                row = i;
            }
        }

        return row + 1;
    }

    public static void main(String[] args) {
        
        int N = 4;
        int M = 4;
        int[][] A = { {1,1,1,1},
                      {1,1,0,0},
                      {0,0,1,1},
                      {1,1,1,1} };
        
        System.out.print(minRow(N, M, A));
    }

}
