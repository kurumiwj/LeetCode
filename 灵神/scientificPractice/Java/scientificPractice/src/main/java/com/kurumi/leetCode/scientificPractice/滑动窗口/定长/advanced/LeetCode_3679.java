package com.kurumi.leetCode.scientificPractice.滑动窗口.定长.advanced;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2026-06-23 上午11:30:04
 * @Description 3679. 使库存平衡的最少丢弃次数
 */
public class LeetCode_3679 {
    private static int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        boolean[] isDropped = new boolean[arrivals.length];
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0, cnt = 0;
        while (right < w && right < arrivals.length) {
            int val = arrivals[right];
            map.put(val, map.getOrDefault(val, 0) + 1);
            // 丢弃当天货物
            if (map.get(val) > m) {
                map.put(val, map.get(val) - 1);
                isDropped[right] = true;
                ++cnt;
            }
            ++right;
        }
        while (right < arrivals.length) {
            int rightVal = arrivals[right], leftVal = arrivals[left];
            // 左端口
            if (right - left == w) {
                if (map.get(leftVal) == 1) map.remove(leftVal);
                else map.put(leftVal, map.get(leftVal) - 1);
                ++left;
                while (isDropped[left]) ++left;
            }
            // 右端口
            map.put(rightVal, map.getOrDefault(rightVal, 0) + 1);
            // 丢弃当天货物
            if (map.get(rightVal) > m) {
                map.put(rightVal, map.get(rightVal) - 1);
                isDropped[right] = true;
                ++cnt;
            }
            ++right;
        }
        return cnt;
    }

    private static int minArrivalsToDiscard1(int[] arrivals, int w, int m) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arrivals.length, cnt = 0;
        for (int j = 0; j < n; ++j) {
            int val = map.getOrDefault(arrivals[j], 0);
            if (val == m) {
                arrivals[j] = 0;
                ++cnt;
            } else map.put(arrivals[j], val + 1);
            int i = j - w + 1;
            if (i >= 0) map.merge(arrivals[i], -1, Integer::sum);
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(minArrivalsToDiscard1(new int[] {1,2,1,3,1}, 4, 2));
        System.out.println(minArrivalsToDiscard1(new int[] {1,2,3,3,3,4}, 3, 2));
        System.out.println(minArrivalsToDiscard1(new int[] {8,8,8,1,7,4,3,7,5,2}, 7, 1));
        System.out.println(minArrivalsToDiscard1(new int[] {1,9,1,3,5,10,10,7,5,4}, 5, 1));
        System.out.println(minArrivalsToDiscard1(new int[] {10,4,3,6,4,5,6,1,4}, 7, 1));
    }
}
