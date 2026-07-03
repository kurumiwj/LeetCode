#198. 打家劫舍
from typing import *

class Solution:
  def rob(self, nums: List[int]) -> int:
    n:int=len(nums)
    dp:List[int]=[0]*(n)
    dp[0]=nums[0]
    if n>1:
      dp[1]=max(nums[0],nums[1])
    for i in range(2,n):
      dp[i]=max(dp[i-1],dp[i-2]+nums[i])
    return dp[n-1]