package com.kurumi.leetCode.medium.模运算;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026年7月14日 14:45:58
 * @Description 2961. 双模幂运算
 */
public class LeetCode_2961 {
    static class Solution {
        private int modPow(int a, int b, int mod) {
            int n = a % mod;
            for (int i = 1; i < b; i++) n = n * a % mod;
            return n;
        }

        public List<Integer> getGoodIndices(int[][] variables, int target) {
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < variables.length; i++) {
                int[] nums = variables[i];
                int a = nums[0], b = nums[1], c = nums[2], m = nums[3];
                if (modPow(modPow(a, b, 10), c, m) == target) res.add(i);
            }
            return res;
        }
    }

    static class Solution1 {
        private int modPow(int a, int b, int mod) {
            int res = 1;
            while (b > 0) {
                if (b % 2 > 0) res = res * a % mod;
                a = a * a % mod;
                b /= 2;
            }
            return res;
        }

        public List<Integer> getGoodIndices(int[][] variables, int target) {
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < variables.length; i++) {
                int[] nums = variables[i];
                if (modPow(modPow(nums[0], nums[1], 10), nums[2], nums[3]) == target) res.add(i);
            }
            return res;
        }
    }
}
