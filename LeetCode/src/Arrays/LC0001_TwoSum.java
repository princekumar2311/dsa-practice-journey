package Arrays;

/**
 * LeetCode 1: Two Sum
 * Difficulty: Easy
 * Topic: Array, HashMap
 *
 * Description:
 * Given an integer array nums and a target,
 * return the indices of two numbers whose sum
 * equals the target.
 *
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 *
 * Approach: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Link: https://leetcode.com/problems/two-sum/
 */

import java.util.HashMap;
import java.util.Map;

public class LC0001_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    // Local testing
    public static void main(String[] args) {
        LC0001_TwoSum solution = new LC0001_TwoSum();

        int[] result = solution.twoSum(
                new int[]{2, 7, 11, 15}, 9
        );

        System.out.println(java.util.Arrays.toString(result));
    }
}

