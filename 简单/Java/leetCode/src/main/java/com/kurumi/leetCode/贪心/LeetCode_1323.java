package com.kurumi.leetCode.贪心;

/**
 * @Author kurumi
 * @Date 2024-10-25 下午11:38:09
 * @Description 1323. 6 和 9 组成的最大数字
 */
public class LeetCode_1323 {
    public int maximum69Number (int num) {
        char[] chars = String.valueOf(num).toCharArray();
        boolean isChange = false;   // 记录是否已经修改过元素
        int res = 0;
        for (char ch : chars) {
            if (ch == '9') {
                res = res * 10 + 9;
            } else {
                if (!isChange) {
                    res = res * 10 + 9;
                    isChange = true;
                } else res = res * 10 + 6;
            }
        }
        return res;
    }
}
