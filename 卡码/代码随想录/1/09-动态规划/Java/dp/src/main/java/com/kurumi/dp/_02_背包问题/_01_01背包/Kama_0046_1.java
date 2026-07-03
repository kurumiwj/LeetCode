//46. 携带研究材料
package com.kurumi.dp._02_背包问题._01_01背包;

import java.util.Scanner;

public class Kama_0046_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    int n = scanner.nextInt();
    int[] weight = new int[m + 1];
    int[] value = new int[m + 1];
    for (int i = 0; i < m; i++) {
      weight[i] = scanner.nextInt();
    }
    for (int i = 0; i < m; i++) {
      value[i] = scanner.nextInt();
    }
    int[] dp = new int[n + 1];
    for (int i = 0; i < m; i++) {
      for (int j = n; j >=weight[i]; j--) {
        dp[j]=Math.max(dp[j], dp[j-weight[i]]+value[i]);
      }
    }
    System.out.println(dp[n]);
  }
}
