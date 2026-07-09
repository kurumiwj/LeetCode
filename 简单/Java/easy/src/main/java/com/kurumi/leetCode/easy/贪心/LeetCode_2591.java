package com.kurumi.leetCode.easy.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月8日 22:18:22
 * @Description 2591. 将钱分给最多的儿童
 */
public class LeetCode_2591 {
    private static int distMoney(int money, int children) {
        if (money < children) return -1;
        int maxEight = Math.min(money / 8, children);
        while (maxEight == children && money - maxEight * 8 > 0 ||
            money - maxEight * 8 < children - maxEight) --maxEight;
        return money - maxEight * 8 == 4 && children - maxEight == 1 ? (maxEight == 0 ? 0 : maxEight - 1) : maxEight;
    }

    public static void main(String[] args) {
        System.out.println(distMoney(20, 3));   // 1
        System.out.println(distMoney(16, 2));   // 2
        System.out.println(distMoney(1, 2));    // -1
        System.out.println(distMoney(8, 2));    // 0
        System.out.println(distMoney(12, 3));   // 1
        System.out.println(distMoney(16, 10));  // 0
        System.out.println(distMoney(17, 2));   // 1
        System.out.println(distMoney(24, 2));   // 1
    }
}
