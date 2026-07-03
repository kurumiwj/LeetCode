//309. 买卖股票的最佳时机含冷冻期
package com.kurumi.dp._04_股票问题;

public class LeetCode_0309 {

}
class Solution {
  public int maxProfit(int[] prices) {
    int[][] dp=new int[2][4]; //持有股票，已卖出，今天卖出，冷冻期
    dp[0][0]=-prices[0];
    for(int i=1;i<prices.length;i++){
      dp[1][0]=Math.max(dp[0][0],Math.max(dp[0][1], dp[0][3])-prices[i]);
      dp[1][1]=Math.max(dp[0][1], dp[0][3]);
      dp[1][2]=dp[0][0]+prices[i];
      dp[1][3]=dp[0][2];
      dp[0][0]=dp[1][0];
      dp[0][1]=dp[1][1];
      dp[0][2]=dp[1][2];
      dp[0][3]=dp[1][3];
    }
    return Math.max(dp[1][1], Math.max(dp[1][2], dp[1][3]));
  }
}
