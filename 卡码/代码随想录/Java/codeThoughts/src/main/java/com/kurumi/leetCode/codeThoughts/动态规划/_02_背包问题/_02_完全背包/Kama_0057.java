package com.kurumi.leetCode.codeThoughts.动态规划._02_背包问题._02_完全背包;

import java.util.Scanner;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 57. 爬楼梯
 */
public class Kama_0057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i >= j)
                    dp[i] += dp[i - j];
                else
                    break;
            }
        }
        System.out.println(dp[n]);
    }
}
