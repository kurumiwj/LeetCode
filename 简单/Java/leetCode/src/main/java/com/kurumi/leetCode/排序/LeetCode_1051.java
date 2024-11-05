package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年11月6日 上午12:00:48
 * @Description 1051. 高度检查器
 */
public class LeetCode_1051 {
    public int heightChecker(int[] heights) {
        int m = Arrays.stream(heights).max().getAsInt();
        int[] cnt = new int[m+1];
        for (int height : heights) {
            ++cnt[height];
        }
        int index = 0, res = 0;
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= cnt[i]; ++j) {
                if (heights[index] != i) ++res;
                ++index;
            }
        }
        return res;
    }
}
