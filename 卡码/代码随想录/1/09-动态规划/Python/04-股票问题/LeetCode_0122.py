#122. 买卖股票的最佳时机 II
from typing import *

class Solution:
  def maxProfit(self, prices: List[int]) -> int:
    dp:List[int]=[-prices[0],0]
    for i in range(1,len(prices)):
      dp[0]=max(dp[0],dp[1]-prices[i])
      dp[1]=max(dp[1],dp[0]+prices[i])
    return dp[1]