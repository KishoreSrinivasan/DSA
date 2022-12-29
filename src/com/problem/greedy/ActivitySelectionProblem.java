package com.problem.greedy;

import java.util.ArrayList;
import java.util.Collections;

public class ActivitySelectionProblem {

    static int optimise(int[] start, int[] end, int n) {

        // this block is doing sorting using the helper:Activity class
        ArrayList<Activity> activity = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            Activity act = new Activity(start[i], end[i]);
            activity.add(act);
        }
        
        Collections.sort(activity, (a, b) -> a.end - b.end );
        
        
        // Here comes the main logic of finding the no of activity can be performed 
        int res = 1;
        int current = 0;
        
        for (int i=1; i<n; i++) {
            
            if (activity.get(current).end < activity.get(i).start) {
                
                res++;
                current = i;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int start[] = { 1, 3, 2, 5 };
        int end[] = { 2, 4, 3, 6 };

        System.out.print(optimise(start, end, start.length));
    }
}

class Activity {

    int start;
    int end;

    public Activity(int start, int end) {

        this.start = start;
        this.end = end;
    }
}
