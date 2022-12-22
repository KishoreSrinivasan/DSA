package com.problem.sortingProblems;

public class LeftMostAndRightMostIndexInSortedArray {
    
    static public pair indexes(long v[], long x) {
        
        // Your code goes here
        pair pair = new pair(-1, -1);

        for (int i = 0; i < v.length; i++) {

            if (v[i] == x) {

                if (pair.first == -1)
                    pair.first = i;

                pair.second = i;
            }
        }

        return pair;
    }

    public static void main(String[] args) {

        long arr[] = {1, 2, 3, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 8, 8, 9};
        
        pair pair = indexes(arr, 5);
        
        System.out.println(pair.first + " === " + pair.second);
    }
    
    static class pair  {  
        
        long first, second;  
        public pair(long first, long second)  
        {  
            this.first = first;  
            this.second = second;  
        }  
    }
}
