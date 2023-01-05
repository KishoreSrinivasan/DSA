package com.problem.array;

import java.util.Arrays;
import java.util.LinkedList;

public class OverlappingIntervals {
    
    static public int[][] overlappedInterval(int[][] intervals) {
        
        // Sort the intervals based on start point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int[][] intervals = {{1,3},
                              {2,4},
                              {6,8},
                              {9,10}};
        
        int[][] result = OverlappingIntervals.overlappedInterval(intervals);
        
        for (int[] element : result)
            System.out.println(element[0] + " ==> " + element[1]);
    }

}
