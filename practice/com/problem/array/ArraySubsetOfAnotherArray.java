package com.problem.array;

import java.util.HashMap;
import java.util.Map;

public class ArraySubsetOfAnotherArray {
    
    // Using HashMap because array is not distinct 
    // in case distinct we can use HashSet
    public static String isSubset(long a1[], long a2[], long n, long m) {

        Map<Long, Integer> map = new HashMap<Long, Integer>();

        for (long element : a1) {

            if (map.containsKey(element))
                map.put(element, map.get(element) + 1);
            else
                map.put(element, 1);
        }

        for (long element : a2) {

            if (map.containsKey(element)) {

                int value = map.get(element);

                if (value - 1 == 0)
                    map.remove(element);
                else
                    map.put(element, value - 1);

            } else
                return "No";
        }

        return "Yes";
    }

    public static void main(String[] args) {
        
        long a1[] = {11, 1, 13, 21, 3, 7};
        long a2[] = {11, 3, 7, 1};
        
        System.out.print(isSubset(a1, a2, a1.length, a2.length));
        
    }

}
