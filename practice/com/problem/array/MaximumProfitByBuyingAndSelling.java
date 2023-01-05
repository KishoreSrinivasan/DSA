package com.problem.array;

public class MaximumProfitByBuyingAndSelling {

    // Max 2 transaction allowed
    static int maxtwobuysell(int arr[],int size) {
        int first_buy = Integer.MIN_VALUE;
          int first_sell = 0;
          int second_buy = Integer.MIN_VALUE;
          int second_sell = 0;
           
          for(int i = 0; i < size; i++) {
             
              first_buy = Math.max(first_buy,-arr[i]);
              first_sell = Math.max(first_sell,first_buy+arr[i]);
              second_buy = Math.max(second_buy,first_sell-arr[i]);
              second_sell = Math.max(second_sell,second_buy+arr[i]);
           
        }
         return second_sell;
    }
    
    public static void main(String[] args) {

        int price[] = { 2, 30, 15, 10, 8, 25, 80 };
        int n = price.length;
        System.out.println(maxtwobuysell(price, n));

    }

}
