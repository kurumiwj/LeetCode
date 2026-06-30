package com.kurumi.scientificPractice.slideWindow.variableLength.other;

/**
 * @Author kurumi
 * @Date 2026-06-24 下午10:37:50
 * @Description 209. 长度最小的子数组
 */
public class LeetCode_0209 {
    private static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, left = 0, sum = 0, res = Integer.MAX_VALUE;
        for (int right = left; right < n; ++right) {
            sum += nums[right];
            while (sum >= target) {
                res = Math.min(res, right - left + 1);
                sum -= nums[left];
                ++left;
            }
//            System.out.println("sum: " + sum + ", res: " + res);
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
        System.out.println(minSubArrayLen(4, new int[] {1,4,4}));
        System.out.println(minSubArrayLen(11, new int[] {1,1,1,1,1,1,1,1}));
    }
}
