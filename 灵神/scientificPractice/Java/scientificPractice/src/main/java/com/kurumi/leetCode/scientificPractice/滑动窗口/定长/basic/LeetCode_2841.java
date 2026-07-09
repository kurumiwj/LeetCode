package com.kurumi.leetCode.scientificPractice.滑动窗口.定长.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2026-06-22 下午9:35:22
 * @Description 2841. 几乎唯一子数组的最大和
 */
public class LeetCode_2841 {
    private static long maxSum(List<Integer> nums, int m, int k) {
        int left = 0, right = 0;
        long sum = 0, res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (right < k - 1) {
            Integer val = nums.get(right);
            if (map.containsKey(val)) map.put(val, map.get(val) + 1);
            else map.put(val, 1);
            sum += val;
            ++right;
        }
        while (right < nums.size()) {
            Integer rightVal = nums.get(right);
            sum += rightVal;
            if (map.containsKey(rightVal)) map.put(rightVal, map.get(rightVal) + 1);
            else map.put(rightVal, 1);
            if (map.size() >= m) res = Math.max(sum, res);

            Integer leftVal = nums.get(left);
            if (map.get(leftVal) == 1) map.remove(leftVal);
            else map.put(leftVal, map.get(leftVal) - 1);
            sum -= leftVal;

            ++left;
            ++right;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxSum(Arrays.asList(2,6,7,3,1,7), 3, 4));
        System.out.println(maxSum(Arrays.asList(5,9,9,2,4,5,4), 1, 3));
        System.out.println(maxSum(Arrays.asList(1,2,1,2,1,2,1), 3, 3));
    }
}
