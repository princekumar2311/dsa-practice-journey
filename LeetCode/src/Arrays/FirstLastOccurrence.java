package Arrays;


import java.util.Arrays;

/*
 * Problem: First and Last Occurrence of an Element
 *
 * Given a sorted array that may contain duplicate elements,
 * find the first and last index of the given target.
 *
 * If the target is not present, return {-1, -1}.
 *
 * Example:
 * Input:  arr = {1, 2, 2, 2, 3, 4, 5}, target = 2
 * Output: {1, 3}
 *
 * Approach:
 * 1. Use binary search to find the first occurrence.
 * 2. Use binary search to find the last occurrence.
 * 3. Continue searching even after finding the target.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class FirstLastOccurrence {

    public static int[] searchRange(int[] arr, int target) {

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        return new int[]{first, last};
    }

    // Finds the first occurrence of target
    private static int findFirst(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // Finds the last occurrence of target
    private static int findLast(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 3;

        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
}
