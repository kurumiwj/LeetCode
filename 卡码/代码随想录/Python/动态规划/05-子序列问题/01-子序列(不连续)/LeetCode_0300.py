#300. 最长递增子序列
from typing import *

class Solution:
  def lengthOfLIS(self, nums: List[int]) -> int:
    dp:List[int]=[1]*len(nums)
    res:int=1
    for i in range(1,len(nums)):
      for j in range(i):
        if nums[i]>nums[j]:
          dp[i]=max(dp[i],dp[j]+1)
      res=dp[i] if dp[i]>res else res
    return res