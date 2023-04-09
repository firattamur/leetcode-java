package org.leetcodejava.problem_0018;

/*

Problem: 4 Sum

    Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

    0 <= a, b, c, d < n
    a, b, c, and d are distinct.
    nums[a] + nums[b] + nums[c] + nums[d] == target
    You may return the answer in any order.

    Example 1:

    Input: nums = [1,0,-1,0,-2,2], target = 0
    Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
    Example 2:

    Input: nums = [2,2,2,2,2], target = 8
    Output: [[2,2,2,2]]

    Constraints:

    1 <= nums.length <= 200
    -109 <= nums[i] <= 109
    -109 <= target <= 109

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    /**
     * Solution: Sort the array, and use two pointers to find the closest sum.
     * <p>
     * Time complexity : O(n^3) where n is the length of the array.
     * Space complexity: O(1)
     * @param nums is the array of integers
     * @param target is the target sum
     * @return is the sum of the three integers that is closest to the target
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {

        if (nums.length < 4) {
            return new ArrayList<>();
        }

        if (nums.length == 4) {
            if ((long) nums[0] + nums[1] + nums[2] + nums[3] == target) {
                return List.of(Arrays.asList(nums[0], nums[1], nums[2], nums[3]));
            } else {
                return new ArrayList<>();
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int ptrL = j + 1;
                int ptrR = nums.length - 1;

                while (ptrL < ptrR) {

                    long sum = (long) nums[i] + nums[j] + nums[ptrL] + nums[ptrR];

                    if (sum == target) {

                        result.add(Arrays.asList(nums[i], nums[j], nums[ptrL], nums[ptrR]));
                        ptrL++;
                        ptrR--;

                        while (ptrL < ptrR && nums[ptrL] == nums[ptrL - 1]) {
                            ptrL++;
                        }
                        while (ptrL < ptrR && nums[ptrR] == nums[ptrR + 1]) {
                            ptrR--;
                        }

                    } else if (sum < target) {
                        ptrL++;
                    } else {
                        ptrR--;
                    }

                }

            }

        }

        return result;

    }

}
