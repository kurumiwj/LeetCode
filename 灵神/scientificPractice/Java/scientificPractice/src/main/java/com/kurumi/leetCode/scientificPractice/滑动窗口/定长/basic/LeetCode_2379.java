package com.kurumi.leetCode.scientificPractice.滑动窗口.定长.basic;

/**
 * @Author kurumi
 * @Date 2026-06-22 下午9:29:42
 * @Description 2379. 得到 K 个黑块的最少涂色次数
 */
public class LeetCode_2379 {
    public int minimumRecolors(String blocks, int k) {
        char[] chs = blocks.toCharArray();
        int left = 0, right = 0, cnt = 0, res = Integer.MAX_VALUE;
        while (right < k - 1) {
            if (chs[right++] == 'W') ++cnt;
        }
        while (right < chs.length) {
            if (chs[right++] == 'W') ++cnt;
            res = Math.min(res, cnt);
            if (chs[left++] == 'W') --cnt;
        }
        return res;
    }
}
