package com.kurumi.leetCode.easy.贪心;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月7日 21:13:30
 * @Description 2144. 打折购买糖果的最小开销
 */
public class LeetCode_2144 {
    private static int minimumCost(int[] cost) {
        int res = 0, i = cost.length - 1;
        Arrays.sort(cost);
        while (i >= 0) {
            if (i - 1 >= 0) res += (cost[i] + cost[i-1]);
            else res += cost[i];
            i -= 3;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] cost = {1, 2, 3};
        System.out.println(minimumCost(cost));
        int[] cost1 = {6, 5, 7, 9, 2, 2};
        System.out.println(minimumCost(cost1));
        int[] cost2 = {5, 5};
        System.out.println(minimumCost(cost2));
    }
}
