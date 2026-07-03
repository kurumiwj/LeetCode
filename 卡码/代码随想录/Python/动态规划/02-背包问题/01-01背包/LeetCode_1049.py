#1049. 最后一块石头的重量 II
from typing import *

class Solution:
  def lastStoneWeightII(self, stones: List[int]) -> int:
    total:int=sum(stones)
    target:int=total//2
    dp:List[int]=[0]*1501
    for i in range(len(stones)):
      for j in range(target,stones[i]-1,-1):
        dp[j]=max(dp[j],dp[j-stones[i]]+stones[i])
    return total-2*dp[target]