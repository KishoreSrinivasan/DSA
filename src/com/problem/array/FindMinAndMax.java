package com.problem.array;

// Basic - DSA Sheet
public class FindMinAndMax {
    
    static class Pair  
    {  
        long first, second;  
        
        public Pair(long first, long second)  
        {  
            // Min
            this.first = first; 
            
            // Max
            this.second = second;  
        }  
    }

    static Pair getMinMax(long a[], long n) {
        
        Pair result = new Pair(a[0], a[0]);

        for (int i = 1; i < n; i++) {

            if (a[i] < result.first)
                result.first = a[i];
            else if (a[i] > result.second)
                result.second = a[i];
        }

        return result;
    }

    public static void main(String[] args) {

        long[] arr = { 1, 5, 100, 5673, 4 };

        Pair pair = FindMinAndMax.getMinMax(arr, arr.length);

        System.out.println(pair.first + " " + pair.second);
    }
}
