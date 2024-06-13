package com.collo;

/**
 * <p>Two Sum</p>
 *
 * @author Collins
 */
public class TwoSum {
    /**
     * <p>
     *     Check Pair within the Array of nums using Naive / Brute-force Approach
     * </p>
     * <p>
     *     <b>Time Complexity: </b> O(N<sup>2</sup>)
     *     <b>Auxiliary Space: </b> O(1)
     * </p>
     *
     * @param nums Array of integers
     * @param target Targeted sum
     * @return int[] indices of the two numbers
     */
    public int[] checkPair(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = (i + 1); j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
