package com.problem.greedy;

import java.util.Arrays;

public class FractionalKnapsack {
    
    static double findMaxValue(Item[] arr, int n) {
        
        Arrays.sort(arr, (a, b) -> {
            
            double value1 = (double)a.value/(double)(a.weight);
            double value2 = (double)b.value/(double)(b.weight);
            
            if (value2<value1) return -1;
            else if (value2>value1) return 1;
            else return 0;
        });
        
        for (Item element : arr) System.out.println(element.value + " " + element.weight);
        
        double res = 0;
        
        for (Item element : arr) {
            
            if (element.weight <= n) {
                
                res = res + element.value;
                n = n - element.weight;
            } else  {
                
                double value = (double)n/ (double)element.weight;
                res = res + (element.value * value);
                break;
            }
            
            if (n==0) break;
        }
        
        return res;
    }

    public static void main(String[] args) {
        
        Item item1 = new Item(60, 10);
        Item item2 = new Item(100, 20);
//        Item item3 = new Item(120, 30);
        
        Item[] arr = { item1, item2};
        
        System.out.print(findMaxValue(arr, 50));
    }
}

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
