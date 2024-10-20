/**
 * @Author: kurumiwj
 * @Date: 2024-10-20 13:47:00
 * @Description: 392. 判断子序列
 */
package com.kurumi.leetCode.双指针;

public class LeetCode_0392 {
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (s.charAt(p1) == t.charAt(p2)) {
                ++p1;
            }
            ++p2;
        }
        return p1 == n;
    }
}
