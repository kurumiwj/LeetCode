#188. 买卖股票的最佳时机 IV
from typing import *

class Solution:
  def maxProfit(self, k: int, prices: List[int]) -> int:
    dp:List[int]=[0]*(2*k)
    for i in range(0,2*k,2):
      dp[i]=-prices[0]
    for i in range(1,len(prices)):
      dp[0]=max(dp[0],-prices[i])
      dp[1]=max(dp[1],dp[0]+prices[i])
      for j in range(2,2*k,2):
        dp[j]=max(dp[j],dp[j-1]-prices[i])
        dp[j+1]=max(dp[j+1],dp[j]+prices[i])
    return dp[2*k-1]