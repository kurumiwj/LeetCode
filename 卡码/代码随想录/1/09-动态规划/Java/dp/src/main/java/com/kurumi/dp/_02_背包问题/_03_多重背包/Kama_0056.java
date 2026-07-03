//56. 携带矿石资源
package com.kurumi.dp._02_背包问题._03_多重背包;

import java.util.Scanner;

public class Kama_0056 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int c=scanner.nextInt();
    int n=scanner.nextInt();
    int[] w=new int[n];
    int[] v=new int[n];
    int[] k=new int[n];
    for(int i=0;i<n;i++){
      w[i]=scanner.nextInt();
    }
    for (int i = 0; i < n; i++) {
      v[i] = scanner.nextInt();
    }
    for (int i = 0; i < n; i++) {
      k[i] = scanner.nextInt();
    }
    int[] dp=new int[c+1];
    for(int i=0;i<n;i++){
      for(int j=c;j>=w[i];j--){
        for(int l=1;l<=k[i]&&j-l*w[i]>=0;l++){
          dp[j]=Math.max(dp[j], dp[j-l*w[i]]+l*v[i]);
        }
      }
    }
    System.out.println(dp[c]);
  }
}
