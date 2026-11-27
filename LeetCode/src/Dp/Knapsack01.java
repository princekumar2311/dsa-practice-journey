package Dp;

import java.util.Arrays;

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

    public static int knapsack(int index,int[] weights, int[] values, int W,int[][] dp) {

        // Your solution here
        if(index==values.length) return 0;
        if(dp[index][W]!=-1) return dp[index][W];
        int skip=knapsack(index+1,weights,values,W,dp);
        if(weights[index]>W) return dp[index][W]=skip;
        int take=values[index]+knapsack(index+1,weights,values,W-weights[index],dp);
        return dp[index][W]=Math.max(skip,take);
    }

    public static void main(String[] args) {

        int[] weights = {1, 3, 4, 5};
        int[] values = {17, 4, 15, 7};
        int W = 8;
        int n=values.length;
        //n->0-n-1 and w-> W--0
        int [][]dp=new int[n][W+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(knapsack(0,weights, values, W,dp));

        // Expected: 36
    }
}
