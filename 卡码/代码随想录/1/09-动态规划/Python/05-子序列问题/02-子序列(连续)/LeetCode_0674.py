#674. 最长连续递增序列
from typing import *

class Solution:
  def findLengthOfLCIS(self, nums: List[int]) -> int:
    dp:List[int]=[1]*len(nums)
    res:int=1
    for i in range(1,len(nums)):
      if nums[i]>nums[i-1]:
        dp[i]=dp[i-1]+1
        res=dp[i] if dp[i]>res else res
    return res