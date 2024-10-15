// 66. 加一
package com.kurumi.leetCode.数组;

/**
 * @author: kurumi
 * @date: 2024-10-16 22:37:45
 */
public class LeetCode_0066 {
    public int[] plusOne(int[] digits) {
        // 从后往前找到第一个不为9的数令其加1, 后面的数都为0
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                ++digits[i];
                for (int j = i + 1; j < digits.length; j++) {
                    digits[j] = 0;
                }
                return digits;
            }
        }
        // digits所有数字都为9
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
