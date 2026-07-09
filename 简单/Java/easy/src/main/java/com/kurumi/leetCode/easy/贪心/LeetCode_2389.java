package com.kurumi.leetCode.easy.贪心;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月8日 21:03:36
 * @Description 2389. 和有限的最长子序列
 */
public class LeetCode_2389 {
    private static int[] answerQueries(int[] nums, int[] queries) {
        int[] res = new int[queries.length];
        Arrays.sort(nums);
        for (int i = 0; i < queries.length; i++) {
            int tmpSum = 0, tmpLen = 0;
            for (int num : nums) {
                tmpSum += num;
                ++tmpLen;
                if (tmpSum <= queries[i]) {
                    res[i] = tmpLen;
                } else break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(answerQueries(new int[]{4, 5, 2, 1}, new int[]{3, 10, 21})));
        System.out.println(Arrays.toString(answerQueries(new int[]{2, 3, 4, 5}, new int[]{1})));
        System.out.println(Arrays.toString(answerQueries(new int[]{736411, 184882, 914641, 37925, 214915}, new int[]{331244, 273144, 118983, 118252, 305688, 718089, 665450})));
    }
}
