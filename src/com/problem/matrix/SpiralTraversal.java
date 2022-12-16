package com.problem.matrix;

import java.util.ArrayList;

// Medium
public class SpiralTraversal {

    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        int startingRow = 0;
        int endingRow = r;
        int startingColumn = 0;
        int endingColumn = c;

        int i = 0;

        while (startingRow < endingRow && startingColumn < endingColumn) {

            for (i = startingColumn; i < endingColumn; ++i)
                result.add(matrix[startingRow][i]);
            startingRow++;

            for (i = startingRow; i < endingRow; ++i)
                result.add(matrix[i][endingColumn - 1]);
            endingColumn--;

            if (startingRow < endingRow) {

                for (i = endingColumn - 1; i >= startingColumn; --i)
                    result.add(matrix[endingRow - 1][i]);
                endingRow--;
            }

            if (startingColumn < endingColumn) {

                for (i = endingRow - 1; i >= startingRow; --i)
                    result.add(matrix[i][startingColumn]);
                startingColumn++;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };

        System.out.print(spirallyTraverse(matrix, 5, 5));

    }
}
