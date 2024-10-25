package com.kurumi.leetCode.双指针;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2024年10月25日 下午8:00:19
 * @Description 696. 计数二进制子串
 */
public class LeetCode_0696 {
    public int countBinarySubstrings(String s) {
        List<Integer> list = new ArrayList<>();
        int res = 0, tmp = 1;
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i-1]) {
                ++tmp;
            } else {
                list.add(tmp);
                tmp = 1;
            }
        }
        list.add(tmp);
        for (int i = 1; i < list.size(); ++i) {
            res += Math.min(list.get(i-1), list.get(i));
        }
        return res;
    }
}
