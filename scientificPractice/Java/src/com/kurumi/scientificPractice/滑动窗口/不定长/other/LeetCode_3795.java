package com.kurumi.scientificPractice.滑动窗口.不定长.other;

/**
 * @Author kurumi
 * @Date 2026-06-25 上午9:22:58
 * @Description
 */
public class LeetCode_3795 {
    public int minLength(int[] nums, int k) {
        int[] cnt = new int[100_005];
        int left = 0, sum = 0, res = Integer.MAX_VALUE;
        for (int right = left; right < nums.length; ++right) {
            int rightVal = nums[right];
            if (cnt[rightVal] == 0) sum += rightVal;
            ++cnt[rightVal];
            while (sum >= k) {
                int leftVal = nums[left];
                --cnt[leftVal];
                if (cnt[leftVal] == 0) sum -= leftVal;
                res = Math.min(res, right - left + 1);
                ++left;
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
