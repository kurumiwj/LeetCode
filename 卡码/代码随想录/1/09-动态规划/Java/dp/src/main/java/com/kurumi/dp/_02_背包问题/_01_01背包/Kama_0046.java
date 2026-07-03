//46. 携带研究材料
package com.kurumi.dp._02_背包问题._01_01背包;

import java.util.Scanner;

public class Kama_0046 {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int m=scanner.nextInt();
    int n=scanner.nextInt();
    int[] weight=new int[m+1];
    int[] value=new int[m+1];
    for(int i=0;i<m;i++){
      weight[i]=scanner.nextInt();
    }
    for(int i=0;i<m;i++){
      value[i]=scanner.nextInt();
    }
    int[][] dp=new int[m+1][n+1];
    for(int j=weight[0];j<=n;j++){
      dp[0][j]=value[0];
    }
    for(int i=1;i<m;i++){
      for(int j=0;j<=n;j++){
        if(j<weight[i]){
          dp[i][j]=dp[i-1][j];
        }else{
          dp[i][j] = Integer.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
        }
      }
    }
    System.out.println(dp[m-1][n]);
  }
}
