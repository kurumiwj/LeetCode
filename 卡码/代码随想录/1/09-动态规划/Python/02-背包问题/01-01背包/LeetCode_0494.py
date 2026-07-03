#494. 目标和
from typing import *

class Solution:
  def findTargetSumWays(self, nums: List[int], target: int) -> int:
    total:int=sum(nums)
    if abs(target)>total or (total+target)%2==1:
      return 0
    n:int=(target+total)//2
    dp:List[int]=[0]*(n+1)
    dp[0]=1
    for i in range(len(nums)):
      for j in range(n,nums[i]-1,-1):
        dp[j]+=dp[j-nums[i]]
    return dp[n]