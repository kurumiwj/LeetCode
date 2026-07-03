//122. 买卖股票的最佳时机 II
package com.kurumi.greedy._02_中等;

public class LeetCode_0122 {

}
class Solution {
  public int maxProfit(int[] prices) {
    int res=0;
    for(int i=1;i<prices.length;i++){
      int tmp=prices[i]-prices[i-1];
      if(tmp>0) res+=tmp;
    }
    return res;
  }
}
