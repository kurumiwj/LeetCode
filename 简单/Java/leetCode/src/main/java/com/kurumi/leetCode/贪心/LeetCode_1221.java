package com.kurumi.leetCode.贪心;

/**
 * @Author kurumi
 * @Date 2024-10-25 下午11:33:11
 * @Description 1221. 分割平衡字符串
 */
public class LeetCode_1221 {
    public int balancedStringSplit(String s) {
        int r = 0, l = 0, res = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'R') {
                if (l > 0) {
                    --l;
                    if (l == 0) ++res;
                }
                else ++r;
            } else {
                if (r > 0) {
                    --r;
                    if (r == 0) ++res;
                }
                else ++l;
            }
        }
        return res;
    }
}
