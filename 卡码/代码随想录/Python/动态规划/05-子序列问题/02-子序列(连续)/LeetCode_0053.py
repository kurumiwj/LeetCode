#53. 最大子数组和
from typing import *

class Solution:
  def maxSubArray(self, nums: List[int]) -> int:
    res:int=nums[0]
    dp:List[int]=[0]*(len(nums))
    dp[0]=nums[0]
    for i in range(1,len(nums)):
      dp[i]=max(dp[i-1]+nums[i],nums[i])
      res=dp[i] if dp[i]>res else res
    return res