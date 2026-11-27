package Dp;

public class Knapsack01 {

    /*
     * Problem: 0/1 Knapsack
     *
     * Each item can be selected at most once.
     * Maximize total value without exceeding capacity W.
     *
     * TODO:
     * 1. Identify the base case.
     * 2. Decide whether to take or skip an item.
     * 3. Build the DP solution.
     */

    public static int knapsack(int index,int[] weights, int[] values, int W) {

        // Your solution here
        if(index==values.length) return 0;
        int skip=knapsack(index+1,weights,values,W);
        if(weights[index]>W) return skip;
        int take=values[index]+knapsack(index+1,weights,values,W-weights[index]);
        return Math.max(skip,take);
    }

    public static void main(String[] args) {

        int[] weights = {1, 3, 4, 5};
        int[] values = {17, 4, 5, 7};
        int W = 8;

        System.out.println(knapsack(0,weights, values, W));

        // Expected: 9
    }
}
