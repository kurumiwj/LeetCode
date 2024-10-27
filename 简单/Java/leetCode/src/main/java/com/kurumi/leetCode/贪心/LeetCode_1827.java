package com.kurumi.leetCode.贪心;

/**
 * @Author kurumi
 * @Date 2024-10-26 下午11:39:26
 * @Description 1827. 最少操作使数组递增
 */
public class LeetCode_1827 {
    public int minOperations(int[] nums) {
        int res = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] <= nums[i-1]) {
                res += nums[i-1] + 1 - nums[i];
                nums[i] = nums[i-1] + 1;
            }
        }
        return res;
    }
}
