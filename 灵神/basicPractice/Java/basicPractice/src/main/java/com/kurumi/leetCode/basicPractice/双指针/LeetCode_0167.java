package com.kurumi.leetCode.basicPractice.双指针;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午10:44:53
 * @Description 167. 两数之和 II - 输入有序数组
 */
public class LeetCode_0167 {
    static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int left = 0, right = numbers.length - 1;
            while (left < right) {
                int sum = numbers[left] + numbers[right];
                if (sum == target) break;
                else if (sum > target) --right;
                else ++left;
            }
            return new int[] {left + 1, right + 1};
        }
    }
}
