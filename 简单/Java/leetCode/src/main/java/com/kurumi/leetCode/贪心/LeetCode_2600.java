package com.kurumi.leetCode.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月8日 22:45:45
 * @Description 2600. K 件物品的最大和
 */
public class LeetCode_2600 {
    private static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes) return k;
        else if (k <= numOnes + numZeros) return numOnes;
        else return numOnes - (k - (numOnes + numZeros));
    }

    public static void main(String[] args) {
        System.out.println(kItemsWithMaximumSum(3, 2, 0, 2));
        System.out.println(kItemsWithMaximumSum(3, 2, 0, 4));
    }
}
