package com.kurumi.codeThoughts.数组.二分;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午10:59:43
 * @Description 704. 二分查找
 */
public class LeetCode_0704 {
    static class Solution {
        public int search(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int middle = (left + right) / 2;
                if (nums[middle] == target)
                    return middle;
                else if (target < nums[middle])
                    right = middle - 1;
                else
                    left = middle + 1;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { -1, 0, 3, 5, 9, 12 };
        Solution solution = new Solution();
        System.out.println(solution.search(nums, 9));
        System.out.println(solution.search(nums, 2));
        System.out.println(solution.search(nums, 13));
    }
}