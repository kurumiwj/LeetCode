package com.kurumi.leetCode.scientificPractice.滑动窗口.定长.other;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author kurumi
 * @Date 2026-06-25 上午10:41:26
 * @Description 1461. 检查一个字符串是否包含所有长度为 K 的二进制子串
 */
public class LeetCode_1461 {
    public boolean hasAllCodes(String s, int k) {
        int target = 1 << k, left = 0;
        char[] chs = s.toCharArray();
        Set<String> set = new HashSet<>();
        for (int right = 0; right < chs.length; right++) {
            if (right - left == k - 1) {
                set.add(new String(chs, left, k));
                ++left;
            }
        }
        return set.size() == target;
    }

    public boolean hasAllCodes1(String s, int k) {
        int target = 1 << k, cnt = 0, x = 0;
        char[] chs = s.toCharArray();
        boolean[] existed = new boolean[target];
        for (int i = 0; i < chs.length && cnt < target; i++) {
            char ch = chs[i];
            x = (x << 1 & (target - 1)) | (ch & 1);
            if (i >= k - 1 && !existed[x]) {
                existed[x] = true;
                ++cnt;
            }
        }
        return cnt == target;
    }
}
