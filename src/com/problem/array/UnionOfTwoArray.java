package com.problem.array;

import java.util.HashSet;

// Basic
public class UnionOfTwoArray {
    
    public static int doUnion(int a[], int n, int b[], int m) {
        // Your code here
        HashSet<Integer> set = new HashSet<Integer>();

        for (int element : a)
            set.add(element);

        for (int element : b)
            set.add(element);

        return set.size();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3 };
        
        System.out.println(UnionOfTwoArray.doUnion(a, a.length, b, b.length));
    }

}
