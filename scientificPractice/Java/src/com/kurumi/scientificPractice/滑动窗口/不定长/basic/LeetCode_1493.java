package com.kurumi.scientificPractice.滑动窗口.不定长.basic;

/**
 * @Author kurumi
 * @Date 2026-06-23 下午8:41:46
 * @Description 1493. 删掉一个元素以后全为 1 的最长子数组
 */
public class LeetCode_1493 {
    private static int longestSubarray(int[] nums) {
        int n = nums.length, res = 0, sum = 0, left = 0, cnt = 0;
        for (int right = 0; right < n; ++right) {
            if (nums[right] == 0) {
                ++cnt;
                if (cnt > 1) {
                    while (nums[left] == 1) {
                        ++left;
                        --sum;
                    }
                    if (nums[left] == 0) ++left;
                    --cnt;
                }
            } else ++sum;
            res = Math.max(res, sum);
        }
        return cnt > 0 ? res : res - 1;
    }
    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[] {1,1,0,1}));
        System.out.println(longestSubarray(new int[] {0,1,1,1,0,1,1,0,1}));
        System.out.println(longestSubarray(new int[] {1,1,1}));
        System.out.println(longestSubarray(new int[] {1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1,0,1,1,1,1,0,1,1,1,1,1}));
    }
}
