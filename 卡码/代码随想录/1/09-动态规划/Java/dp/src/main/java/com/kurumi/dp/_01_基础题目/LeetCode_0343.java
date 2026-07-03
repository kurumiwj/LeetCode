//343. 整数拆分
package com.kurumi.dp._01_基础题目;

public class LeetCode_0343 {

}
class Solution {
  public int integerBreak(int n) {
    int[] dp=new int[n+1];
    dp[0]=0;
    dp[1]=0;
    dp[2]=1;
    for(int i=3;i<=n;i++)
      for(int j=1;j<=i/2;j++){
        dp[i]=Integer.max(dp[i], Integer.max(j*dp[i-j], j*(i-j)));
      }
    return dp[n];
  }
}
