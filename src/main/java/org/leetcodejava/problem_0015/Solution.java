package org.leetcodejava.problem_0015;

/*

Problem: 3 Sum

    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

    Notice that the solution set must not contain duplicate triplets.

    Example 1:

    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
    Explanation:
    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
    The distinct triplets are [-1,0,1] and [-1,-1,2].
    Notice that the order of the output and the order of the triplets does not matter.
    Example 2:

    Input: nums = [0,1,1]
    Output: []
    Explanation: The only possible triplet does not sum up to 0.
    Example 3:

    Input: nums = [0,0,0]
    Output: [[0,0,0]]
    Explanation: The only possible triplet sums up to 0.


    Constraints:

    3 <= nums.length <= 3000
    -105 <= nums[i] <= 105


 */

import java.util.*;

public class Solution {

    /**
     * Solution: Two pointers (left and right) to find the sum of three numbers
     * <p>
     * Time complexity: O(n^2)
     * Space complexity: O(n)
     * @param nums is the array of integers
     * @return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0
     */
    public List<List<Integer>> threeSum(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int ptrL = i + 1;
            int ptrR = nums.length - 1;

            while (ptrL < ptrR) {

                int sum = nums[i] + nums[ptrL] + nums[ptrR];

                if (sum == 0) {
                    result.add(List.of(nums[i], nums[ptrL], nums[ptrR]));
                    ptrL++;
                    ptrR--;

                    while (ptrL < ptrR && nums[ptrL] == nums[ptrL - 1]) {
                        ptrL++;
                    }

                    while (ptrL < ptrR && nums[ptrR] == nums[ptrR + 1]) {
                        ptrR--;
                    }

                } else if (sum < 0) {
                    ptrL++;
                } else {
                    ptrR--;
                }

            }

        }

        return result;

    }

}
