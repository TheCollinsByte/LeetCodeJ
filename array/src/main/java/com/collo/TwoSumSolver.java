package com.collo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.</p>
 *
 * @author Collins (TheOddagen)
 */
public class TwoSumSolver {
    // TODO: Solution using Binary Search and remainders of the elements less than X

    /**
     * Default Constructor.
     * Constructs a new instance of TwoSumSolver class.
     */
    public TwoSumSolver() {
    }

    /**
     * <p>
     *     Check Pair within the Array of nums using Naive / Brute-force Approach
     *     <b>Time Complexity: </b> O(N<sup>2</sup>)
     *     <b>Auxiliary Space: </b> O(1)
     * </p>
     *
     * @param nums Array of integers
     * @param target Targeted sum
     * @return int[] indices of the two numbers
     */
    public int[] findPairBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = (i + 1); j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    /**
     *
     * <p>
     *     Checking for Two Sum using Sorting and Two-Pointers Technique:
     *     <b>Time Complexity: </b> O(NLogN), Time complexity for sorting the array
     *     <b>Auxiliary Space: </b> O(1)
     * </p>
     *
     * @param nums Array of integers
     * @param target Targeted sum
     * @return boolean
     */
    public boolean hasPairWithSumTwoPointers(int[] nums, int target) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target)
                return true;
            else if (sum < target)
                left++;
            else
                right--;
        }

        return false;
    }

    /**
     *
     * <p>
     *     Finds two indices in the array such that the numbers at those indices add up to the target, using Hashing
     *     <b>Time Complexity: </b> O(n)
     *     <b>Auxiliary Space: </b> O(n)
     *     <b></b>
     * <p/>
     *
     * @param nums    The Array of Integers
     * @param target  The target sum.
     * @return int[]  An array of two integers representing the indices of the two numbers that add up to the target.
     *                Returns an empty array if no such indices exist.
     */
    public int[] findPairWithSumHashing(int[] nums, int target) {

        // value, index
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }

        return new int[]{};
    }
}
