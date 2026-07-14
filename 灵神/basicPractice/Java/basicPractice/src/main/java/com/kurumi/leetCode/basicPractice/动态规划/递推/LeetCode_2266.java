package com.kurumi.leetCode.basicPractice.动态规划.递推;

import java.util.Map;

/**
 * @Author kurumi
 * @Date 2026-07-09 下午1:40:21
 * @Description 2266. 统计打字方案数
 */
public class LeetCode_2266 {
    static class Solution {
        public int countTexts(String pressedKeys) {
            int MOD = 1_000_000_007, cnt = 0;
            long res = 1;
            Map<Integer, String> map = Map.of(2, "abc", 3, "def", 4, "ghi", 5, "jkl", 6, "mno", 7, "pqrs", 8, "tuv", 9, "wxyz");
            char[] chs = pressedKeys.toCharArray();
            long[][] dp = new long[2][Math.max(4, chs.length + 1)];    // 0—长度为3的字符串，1—长度为4的字符串
            dp[0][0] = dp[1][0] = 1;
            dp[0][1] = dp[1][1] = 1;
            dp[0][2] = dp[1][2] = 2;
            dp[0][3] = dp[1][3] = 4;
            for (int i = 4; i < chs.length + 1; i++) {
                dp[0][i] = (dp[0][i - 1] + dp[0][i - 2] + dp[0][i - 3]) % MOD;
                dp[1][i] = (dp[1][i - 1] + dp[1][i - 2] + dp[1][i - 3] + dp[1][i - 4]) % MOD;
            }
            for (int i = 0; i < chs.length; i++) {
                ++cnt;
                if (i == chs.length - 1 || chs[i] != chs[i + 1]) {
                    res = res * (chs[i] != '7' && chs[i] != '9' ? dp[0][cnt] : dp[1][cnt]) % MOD;
                    cnt = 0;
                }
            }
            return (int) res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countTexts("2"));
        System.out.println(solution.countTexts("22233"));
        System.out.println(solution.countTexts("222222222222222222222222222222222222"));
    }
}
