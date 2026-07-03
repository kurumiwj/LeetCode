#309. 买卖股票的最佳时机含冷冻期
from typing import *

class Solution:
  def maxProfit(self, prices: List[int]) -> int:
    dp:List[List[int]]=[[0]*4 for x in range(2)]  #持有股票，已卖出，今天卖出，冷冻期
    dp[0][0]=-prices[0]
    for i in range(1,len(prices)):
      dp[1][0]=max(dp[0][0],max(dp[0][1],dp[0][3])-prices[i])
      dp[1][1]=max(dp[0][1],dp[0][3])
      dp[1][2]=dp[0][0]+prices[i]
      dp[1][3]=dp[0][2]
      dp[0][0],dp[0][1],dp[0][2],dp[0][3]=dp[1][0],dp[1][1],dp[1][2],dp[1][3]
    return max(dp[1][1],max(dp[1][2],dp[1][3]))