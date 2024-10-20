// 202. 快乐数
package com.kurumi.leetCode.双指针;

/**
 * @author: kurumi
 * @date: 2024-10-19 14:17:28
 */
public class LeetCode_0202 {
    public int next(int num) {
        int total = 0;
        while (num > 0) {
            int tmp = num % 10;
            total += tmp * tmp;
            num /= 10;
        }
        return total;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = next(n);
        while (fast != 1 && slow != fast) {
            fast = next(next(fast));
            slow = next(slow);
        }
        return fast == 1;
    }
}
