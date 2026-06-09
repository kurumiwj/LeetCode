package com.kurumi.leetCode.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月9日 21:13:35
 * @Description 2706. 购买两块巧克力
 */
public class LeetCode_2706 {
    private static int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                secondMin = min;
                min = price;
            } else if (price < secondMin) secondMin = price;
        }
        return min + secondMin > money ? money : money - min - secondMin;
    }

    public static void main(String[] args) {
        System.out.println(buyChoco(new int[]{1, 2, 2}, 3));
        System.out.println(buyChoco(new int[]{3, 2, 3}, 3));
    }
}
