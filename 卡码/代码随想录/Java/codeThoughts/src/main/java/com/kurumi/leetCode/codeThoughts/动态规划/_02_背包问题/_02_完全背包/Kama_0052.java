package com.kurumi.leetCode.codeThoughts.动态规划._02_背包问题._02_完全背包;

import java.util.Scanner;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 52. 携带研究材料
 */
public class Kama_0052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int v = scanner.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = scanner.nextInt();
            value[i] = scanner.nextInt();
        }
        int[] dp = new int[v + 1];
        for (int i = 0; i < n; i++) {
            for (int j = weight[i]; j <= v; j++) {
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
        }
        scanner.close();
        System.out.println(dp[v]);
    }
}
