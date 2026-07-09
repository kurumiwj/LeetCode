package com.kurumi.leetCode.scientificPractice.滑动窗口.不定长.basic;

/**
 * @Author kurumi
 * @Date 2026-06-24 下午10:09:47
 * @Description 1004. 最大连续1的个数 III
 */
public class LeetCode_1004 {
    private static int longestOnes(int[] nums, int k) {
        int n = nums.length, left = 0, res = 0, cnt = 0;
        for (int right = left; right < n; ++right) {
            if (nums[right] == 0) ++cnt;
            while (cnt > k) {
                if (nums[left] == 0) --cnt;
                ++left;
            }
            res = Math.max(res, right - left + 1);
//            System.out.println("left: " + left + ", right: " + right + ", res: " + res);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2));
        System.out.println(longestOnes(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
        System.out.println(longestOnes(new int[] {0,0,0,1}, 4));
    }
}
