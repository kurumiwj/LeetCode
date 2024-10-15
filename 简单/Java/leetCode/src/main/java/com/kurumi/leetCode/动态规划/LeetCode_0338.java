// 338. 比特位计数
package com.kurumi.leetCode.动态规划;

/**
 * @author: kurumi
 * @date: 2024-10-16 22:01:31
 */
public class LeetCode_0338 {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int i = 1; i <= n; i++) {
            res[i] = Integer.bitCount(i);
        }
        return res;
    }
    public static void main(String[] args) {
        LeetCode_0338 test = new LeetCode_0338();
        for (int num : test.countBits(5)) {
            System.out.println(num);
        }
    }
}
