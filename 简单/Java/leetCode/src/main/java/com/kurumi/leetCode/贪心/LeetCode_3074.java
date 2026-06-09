package com.kurumi.leetCode.贪心;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月9日 21:40:03
 * @Description 3074. 重新分装苹果
 */
public class LeetCode_3074 {
    private static int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum = 0, index = capacity.length - 1, c = capacity[index], cnt = 1;
        for (int a : apple) {
            sum += a;
        }
        while (c < sum) {
            --index;
            ++cnt;
            c += capacity[index];
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(minimumBoxes(new int[]{1, 3, 2}, new int[]{4, 3, 1, 5, 2}));
        System.out.println(minimumBoxes(new int[]{5, 5, 5}, new int[]{2, 4, 2, 7}));
    }
}
