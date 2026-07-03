#121. 买卖股票的最佳时机
from typing import *

class Solution:
  def maxProfit(self, prices: List[int]) -> int:
    dp:List[int]=[prices[0],0]
    for i in range(1,len(prices)+1):
      dp[0]=min(dp[0],prices[i-1])
      dp[1]=max(dp[1],prices[i-1]-dp[0])
    return dp[1]