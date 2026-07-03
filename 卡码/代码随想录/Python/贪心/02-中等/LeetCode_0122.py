#122. 买卖股票的最佳时机 II
from typing import *

class Solution:
  def maxProfit(self, prices: List[int]) -> int:
    res:int=0
    for i in range(1,len(prices)):
      res+=max(prices[i]-prices[i-1],0)
    return res