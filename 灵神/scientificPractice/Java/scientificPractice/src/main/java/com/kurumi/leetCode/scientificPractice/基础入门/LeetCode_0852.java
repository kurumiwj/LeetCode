package com.kurumi.leetCode.scientificPractice.基础入门;

/**
 * @Author kurumi
 * @Date 2026-07-10 上午12:54:01
 * @Description 852. 山脉数组的峰顶索引
 */
public class LeetCode_0852 {
    static class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            int left = 1, right = arr.length - 2;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] < arr[mid + 1]) left = mid + 1;
                else right = mid - 1;
            }
            return left;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.peakIndexInMountainArray(new int[] {3,5,3,2,0}));
    }
}
