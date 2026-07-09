package com.kurumi.leetCode.easy.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月10日 21:50:45
 * @Description 3745. 三元素表达式的最大值
 */
public class LeetCode_3745 {
    private static int maximizeExpressionOfThree(int[] nums) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) secondMax = num;
            if (num < min) min = num;
        }
        return max + secondMax - min;
    }

    public static void main(String[] args) {
        System.out.println(maximizeExpressionOfThree(new int[]{1, 4, 2, 5}));
        System.out.println(maximizeExpressionOfThree(new int[]{-2, 0, 5, -2, 4}));
    }
}
