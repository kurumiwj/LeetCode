package com.kurumi.leetCode.哈希;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2024年11月15日 上午12:07:17
 * @Description 202. 快乐数
 */
public class LeetCode_0202 {
    public boolean isHappy(int n) {
        Map<Integer, Boolean> isExist = new HashMap<>();
        while (!isExist.containsKey(n)) {
            isExist.put(n, true);
            n = squareSum(n);
            if (n == 1) return true;
        }
        return n == 1;
    }
    
    private int squareSum(int n) {
        int res = 0;
        while (n > 0) {
            res += (n % 10) * (n % 10);
            n /= 10;
        }
        return res;
    }
}
