package org.leetcodejava.problem_0016;

/*

Problem: 3 Sum Closest

    Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

    Return the sum of the three integers.

    You may assume that each input would have exactly one solution.

    Example 1:

    Input: nums = [-1,2,1,-4], target = 1
    Output: 2
    Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
    Example 2:

    Input: nums = [0,0,0], target = 1
    Output: 0
    Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

    Constraints:

    3 <= nums.length <= 500
    -1000 <= nums[i] <= 1000
    -104 <= target <= 104

*/

import java.util.Arrays;

public class Solution {

    /**
     * Solution: Sort the array, and use two pointers to find the closest sum.
     * <p>
     * Time complexity : O(n^2) where n is the length of the array.
     * Space complexity: O(1)
     * @param nums is the array of integers
     * @param target is the target sum
     * @return is the sum of the three integers that is closest to the target
     */
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length; i++) {

            int ptrL = i + 1;
            int ptrR = nums.length - 1;

            while (ptrL < ptrR) {

                int sum = nums[i] + nums[ptrL] + nums[ptrR];

                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }

                if (sum < target) {
                    ptrL++;
                } else {
                    ptrR--;
                }

            }

        }

        return closest;

    }

}
