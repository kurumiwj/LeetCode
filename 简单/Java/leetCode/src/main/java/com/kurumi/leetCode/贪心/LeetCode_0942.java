package com.kurumi.leetCode.贪心;

/**
 * @Author kurumi
 * @Date 2024-10-24 上午12:18:01
 * @Description 942. 增减字符串匹配
 */
public class LeetCode_0942 {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] res = new int[n+1];
        int index = 0, low = 0, high = n;
        for (char ch : s.toCharArray()) {
            if (ch == 'I') {    // 碰到I取最小的
                res[index] = low;
                ++low;
            } else {    // 碰到D取最大的
                res[index] = high;
                --high;
            }
            ++index;
        }
        res[index] = low;
        return res;
    }
}
