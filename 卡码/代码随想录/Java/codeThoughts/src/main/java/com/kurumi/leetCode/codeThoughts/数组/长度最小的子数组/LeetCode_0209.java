package com.kurumi.leetCode.codeThoughts.数组.长度最小的子数组;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午10:59:43
 * @Description 209. 长度最小的子数组
 */
public class LeetCode_0209 {
    static class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int i = 0, sum = 0, res = nums.length + 1;
            for (int j = 0; j < nums.length; j++) {
                sum += nums[j];
                while (sum >= target) {
                    res = Integer.min(res, j - i + 1);
                    sum -= nums[i];
                    i++;
                }
            }
            return res == nums.length + 1 ? 0 : res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minSubArrayLen(7, new int[] { 2, 3, 1, 2, 4, 3 }));
    }
}
