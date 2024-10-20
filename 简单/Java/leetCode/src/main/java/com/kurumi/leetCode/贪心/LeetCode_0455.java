/**
 * @Author: kurumiwj
 * @Date: 2024-10-20 17:56:42
 * @Description: 455. 分发饼干
 */
package com.kurumi.leetCode.贪心;

import java.util.Arrays;

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
