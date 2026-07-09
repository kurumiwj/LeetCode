package com.kurumi.leetCode.scientificPractice.滑动窗口.不定长.basic;

/**
 * @Author kurumi
 * @Date 2026-06-24 下午8:29:52
 * @Description 1695. 删除子数组的最大得分
 */
public class LeetCode_1695 {
    private static int maximumUniqueSubarray(int[] nums) {
        int n = nums.length, left = 0, res = 0, sum = 0;
        boolean[] existed = new boolean[10_005];
        for (int num : nums) {
            while (existed[num]) {
                sum -= nums[left];
                existed[nums[left]] = false;
                ++left;
            }
            sum += num;
            existed[num] = true;
            res = Math.max(res, sum);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maximumUniqueSubarray(new int[] {4,2,4,5,6}));
        System.out.println(maximumUniqueSubarray(new int[] {5,2,1,2,5,2,1,2,5}));
    }
}
