//123. 买卖股票的最佳时机 III
package com.kurumi.dp._04_股票问题;

public class LeetCode_0123 {

}
class Solution {
  public int maxProfit(int[] prices) {
    int[] dp=new int[]{-prices[0],0,-prices[0],0};
    for(int i=1;i<prices.length;i++){
      dp[0]=Math.max(dp[0], -prices[i]);
      dp[1]=Math.max(dp[1],dp[0]+prices[i]);
      dp[2]=Math.max(dp[2], dp[1]-prices[i]);
      dp[3]=Math.max(dp[3], dp[2]+prices[i]);
    }
    return dp[3];
  }
}
