package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年10月29日 上午12:49:06
 * @Description 455. 分发饼干
 */
public class LeetCode_0455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        for (int i = 0, j = 0; i < g.length && j < s.length; ++j) {
            // 第j块饼干够分给第i个孩子
            if (g[i] <= s[j]) {
                ++res;
                ++i;
            }
        }
        return res;
    }
}
