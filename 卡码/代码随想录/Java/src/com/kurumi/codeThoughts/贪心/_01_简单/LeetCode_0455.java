package com.kurumi.codeThoughts.贪心._01_简单;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 455. 分发饼干
 */
public class LeetCode_0455 {
    static class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int index = s.length - 1;
            int res = 0;
            for (int i = g.length - 1; i >= 0; i--) {
                if (index < 0)
                    break;
                if (s[index] >= g[i]) {
                    index--;
                    res++;
                }
            }
            return res;
        }
    }
}
