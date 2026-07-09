package com.kurumi.leetCode.easy.双指针;

import java.util.Arrays;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-06-13 下午2:55:23
 * @Description 2824. 统计和小于目标的下标对数目
 */
public class LeetCode_2824 {
    private static int countPairs(List<Integer> nums, int target) {
        int i = 0, cnt = 0;
        while (i < nums.size() - 1) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) ++cnt;
            }
            ++i;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(countPairs(Arrays.asList(-1 , 1, 2, 3, 1), 2));
    }
}
