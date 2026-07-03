//518. 零钱兑换 II
package com.kurumi.dp._02_背包问题._02_完全背包;

public class LeetCode_0518 {

}

class Solution {
  public int change(int amount, int[] coins) {
    int[] dp=new int[amount+1];
    dp[0]=1;
    for(int i=0;i<coins.length;i++){
      for(int j=coins[i];j<=amount;j++){
        dp[j]+=dp[j-coins[i]];
      }
    }
    return dp[amount];
  }
}
