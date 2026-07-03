//57. 爬楼梯
package com.kurumi.dp._02_背包问题._02_完全背包;

import java.util.Scanner;

public class Kama_0057 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    int m=scanner.nextInt();
    int[] dp=new int[n+1];
    dp[0]=1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=m;j++){
        if(i>=j) dp[i]+=dp[i-j];
        else break;
      }
    }
    System.out.println(dp[n]);
  }
}
