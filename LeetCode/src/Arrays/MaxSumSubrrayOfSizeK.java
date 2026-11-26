package Arrays;


public class MaxSumSubrrayOfSizeK {

    public static int maxSumSubarray(int[] arr, int k) {

        // TODO 1: Handle invalid input (k <= 0 or k > arr.length)
        if(k<0 || k>arr.length) return 0;

        // TODO 2: Initialize variables
        int maxSum;
        int RunningSum=0;
        // TODO 3: Calculate the sum of the first window of size k
        for(int i=0;i<k;i++){
            RunningSum+=arr[i];
        }
        // TODO 4: Store the first window sum as maxSum
        maxSum=RunningSum;

        // TODO 5: Start sliding the window from index k
        int j=k;
        while(j<arr.length){
            RunningSum=RunningSum+arr[j]-arr[j-k];
            maxSum=Math.max(maxSum,RunningSum);
            j++;
        }
        // TODO 6: Return the maximum sum

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 12};
        int k = 3;

        System.out.println(maxSumSubarray(arr, k));

        // Expected Output: 16
    }
}

