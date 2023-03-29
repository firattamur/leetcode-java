package org.leetcodejava.problem_0004;

public class Solution {

    /**
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
     * Merge the two arrays with keeping the sorted order. Then find the median of the merged array.
     * <p>
     * Time complexity : O(n)
     * Space complexity: O(n)
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merged = new int[nums1.length + nums2.length];
        int[] mergedArray = merge(nums1, nums2);

        return findMedian(mergedArray);

    }


    /**
     * Merge two sorted arrays into one sorted array. Merge arrays with two pointers technique.
     * <p>
     * Time complexity  : O(n)
     * Space complexity : O(n)
     * @param nums1
     * @param nums2
     * @return
     */
    private int[] merge(int[] nums1, int[] nums2) {

        int[] mergedArray = new int[nums1.length + nums2.length];

        int p1 = 0;
        int p2 = 0;
        int i = 0;

        while (p1 < nums1.length && p2 < nums2.length) {

            if (nums1[p1] < nums2[p2]) {
                mergedArray[i] = nums1[p1];
                p1++;
            } else {
                mergedArray[i] = nums2[p2];
                p2++;
            }

            i++;

        }

        while (p1 < nums1.length) {
            mergedArray[i] = nums1[p1];
            p1++;
            i++;
        }

        while (p2 < nums2.length) {
            mergedArray[i] = nums2[p2];
            p2++;
            i++;
        }

        return mergedArray;

    }


    /**
     * Find the median of a sorted array of integers.
     * <p>
     * Time complexity  : O(1)
     * Space complexity : O(1)
     * @param array is a sorted array of integers.
     * @return the median of the array.
     */
    private double findMedian(int[] array) {

        int length = array.length;

        if (length % 2 == 0) {
            int mid1 = length / 2;
            int mid2 = mid1 - 1;
            return (array[mid1] + array[mid2]) / 2.0;
        } else {
            return array[length / 2];
        }

    }

}
