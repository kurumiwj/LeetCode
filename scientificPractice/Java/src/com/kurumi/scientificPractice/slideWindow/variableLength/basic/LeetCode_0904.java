package com.kurumi.scientificPractice.slideWindow.variableLength.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2026-06-23 下午10:01:46
 * @Description 904. 水果成篮
 */
public class LeetCode_0904 {
    private static int totalFruit(int[] fruits) {
        int res = 0, left = 0, n = fruits.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < n; ++right) {
            map.merge(fruits[right], 1, Integer::sum);
            while (map.size() > 2) {
                int leftVal = fruits[left];
                map.merge(leftVal, -1, Integer::sum);
                if (map.get(leftVal) == 0) map.remove(leftVal);
                ++left;
            }
            res = Math.max(right - left + 1, res);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(totalFruit(new int[] {1,2,1}));  // 3
        System.out.println(totalFruit(new int[] {0,1,2,2}));    // 3
        System.out.println(totalFruit(new int[] {1,2,3,2,2}));  // 4
        System.out.println(totalFruit(new int[] {3,3,3,1,2,1,1,2,3,3,4}));  // 5
        System.out.println(totalFruit(new int[] {1,0,1,4,1,4,1,2,3}));
    }
}
