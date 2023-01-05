package com.problem.string;

import java.util.LinkedList;
import java.util.Queue;

// Easy
public class LookAndSayPattern {

    public static String lookandsay(int n) {
        
        // your code here
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(null);

        int count = 1;
        int previous = 1;

        while (count < n) {
            
            int occurence = 0;
            
            while (!queue.isEmpty()) {
                
                Integer current = queue.remove();
                
                if (current == null) {
                    
                    queue.add(occurence);
                    queue.add(previous);
                    
                    queue.add(null);
                    
                    previous = queue.peek();
                    occurence = 0;
                    
                    count++;
                    break;
                }
                
                if (current == previous) {
                    
                    occurence++;  
                    
                } else {
                    
                    queue.add(occurence);
                    queue.add(previous);
                    
                    previous = current;
                    occurence = 1;
                }
            }
        }
        
        // removing from the queue and converting to string
        String result = "";

        for (Integer element : queue) {

            if (element == null) break;
            result = result + "" + element;
        }

        return result;

        
    }
    
    public static void main(String[] args) {
        
        // 1 is read off as "one 1" or 11.
        // 11 is read off as "two 1s" or 21.
        // 21 is read off as "one 2, then one 1" or 1211.
        // 1211 is read off as "one 1, one 2, then two 1s" or 111221.
        // 111221 is read off as "three 1s, two 2s, then one 1" or 312211.

        System.out.println(LookAndSayPattern.lookandsay(45));

    }

}
