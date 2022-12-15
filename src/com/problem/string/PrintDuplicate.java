package com.problem.string;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicate {
    
    public static void printDuplicate(String input) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (Character element : input.toCharArray()) {
            
            if (map.containsKey(element))
                map.put(element, map.get(element) + 1);
            else map.put(element, 1);
        }
        
        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            
            if (set.getValue() > 1)
                System.out.println(set.getKey() + " ==> " + set.getValue());
        }
    }

    public static void main(String[] args) {
        
        String input = "malayalam";
        
        PrintDuplicate.printDuplicate(input);
    }

}
