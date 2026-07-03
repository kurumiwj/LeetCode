//121. 买卖股票的最佳时机
package com.kurumi.dp._04_股票问题;

public class LeetCode_0121 {

}
class Solution {
  public int maxProfit(int[] prices) {
    int[] dp=new int[]{-prices[0],0};
    for(int i=1;i<=prices.length;i++){
      dp[0]=Math.max(dp[0],-prices[i-1]);
      dp[1]=Math.max(dp[1], dp[0]+prices[i-1]);
    }
    return dp[1];
  }
}
