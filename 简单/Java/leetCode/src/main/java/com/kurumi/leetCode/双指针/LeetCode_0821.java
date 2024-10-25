package com.kurumi.leetCode.双指针;

/**
 * @Author kurumi
 * @Date 2024年10月25日 下午11:14:51
 * @Description 821. 字符的最短距离
 */
public class LeetCode_0821 {
    public int[] shortestToChar(String s, char c) {
        int n = s.length(), index = -n;
        int[] res = new int[n];
        // 遍历每个字符到左边最近字符c的距离
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == c) {
                index = i;
            }
            res[i] = i - index;
        }
        index = 2 * n;
        // 遍历每个字符到右边最近字符c的距离
        for (int i = n-1; i >= 0; --i) {
            if (s.charAt(i) == c) {
                index = i;
            }
            res[i] = Math.min(res[i], index - i);
        }
        return res;
    }
}
