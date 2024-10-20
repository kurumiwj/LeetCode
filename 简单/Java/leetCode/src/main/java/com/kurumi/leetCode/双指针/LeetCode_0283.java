// 283. 移动零
package com.kurumi.leetCode.双指针;

/**
 * @author: kurumi
 * @date: 2024-10-19 16:29:14
 */
public class LeetCode_0283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length, start = 0, end = 0;
        if (n <= 1)
            return;
        while (end < n) {
            if (nums[end] != 0) {
                int tmp = nums[start];
                nums[start] = nums[end];
                nums[end] = tmp;
                start++;
            }
            end++;
        }
    }
}
