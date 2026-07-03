#714. 买卖股票的最佳时机含手续费
from typing import *

class Solution:
  def maxProfit(self, prices: List[int], fee: int) -> int:
    dp:List[int]=[-prices[0],0]
    for i in range(1,len(prices)):
      dp[0]=max(dp[0],dp[1]-prices[i])
      dp[1]=max(dp[1],dp[0]+prices[i]-fee)
    return dp[1]