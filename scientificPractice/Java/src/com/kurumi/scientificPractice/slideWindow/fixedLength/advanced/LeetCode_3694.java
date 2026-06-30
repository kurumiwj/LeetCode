package com.kurumi.scientificPractice.slideWindow.fixedLength.advanced;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author kurumi
 * @Date 2026-06-25 下午3:13:54
 * @Description 3694. 删除子字符串后不同的终点
 */
public class LeetCode_3694 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.distinctPoints1("LUL", 1));
        System.out.println(solution.distinctPoints1("UDLR", 4));
    }
}

class Solution {
    private final int[][] dirs = new int[128][];

    {
        dirs['L'] = new int[] {-1, 0};
        dirs['R'] = new int[] {1, 0};
        dirs['D'] = new int[] {0, -1};
        dirs['U'] = new int[] {0, 1};
    }

    public int distinctPoints(String s, int k) {
        char[] chs = s.toCharArray();
        Set<Long> set = new HashSet<>();
        int x = 0, y = 0;
        for (int i = 0; i < chs.length; i++) {
            char in = chs[i];
            x += dirs[in][0];
            y += dirs[in][1];
            int left = i - k + 1;
            if (left < 0) continue;
            set.add((long) (x + chs.length) << 20 | (y + chs.length));
            char out = chs[left];
            x -= dirs[out][0];
            y -= dirs[out][1];
        }
        return set.size();
    }

    public int distinctPoints1(String s, int k) {
        char[] chs = s.toCharArray();
        Set<Long> set = new HashSet<>();
        int x = 0, y = 0;
        set.add((long) chs.length << 20 | chs.length);
        for (int i = k; i < chs.length; i++) {
            char in = chs[i];
            char out = chs[i - k];
            x += dirs[in][0] - dirs[out][0];
            y += dirs[in][1] - dirs[out][1];
            set.add((long) (x + chs.length) << 20 | (y + chs.length));
        }
        return set.size();
    }
}
