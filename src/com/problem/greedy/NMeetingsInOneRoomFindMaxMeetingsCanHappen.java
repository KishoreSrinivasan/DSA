package com.problem.greedy;

import java.util.ArrayList;
import java.util.Collections;

public class NMeetingsInOneRoomFindMaxMeetingsCanHappen {

    static int maxMeetings(int[] start, int[] end, int n) {

        // this block is doing sorting using the helper:Meeting  class sorting by end
        ArrayList<Meeting> meeting = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            Meeting meet = new Meeting(start[i], end[i]);
            meeting.add(meet);
        }

        Collections.sort(meeting, (a, b) -> a.end - b.end);

        // Here comes the main logic of finding the no of meeting can be performed
        int res = 1;
        int current = 0;

        for (int i = 1; i < n; i++) {

            if (meeting.get(current).end < meeting.get(i).start) {

                res++;
                current = i;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        System.out.print(maxMeetings(start, end, start.length));
    }
}

class Meeting {

    int start;
    int end;

    public Meeting(int start, int end) {

        this.start = start;
        this.end = end;
    }
}
