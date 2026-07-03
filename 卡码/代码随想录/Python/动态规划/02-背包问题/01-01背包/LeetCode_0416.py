#416. 分割等和子集
from typing import *

class Solution:
  def canPartition(self, nums: List[int]) -> bool:
    sum:int=0
    for num in nums:
      sum+=num
    if sum%2==1:
      return False
    target:int=sum//2
    dp:List[int]=[0]*10001
    for i in range(len(nums)):
      for j in range(target,nums[i]-1,-1):
        dp[j]=max(dp[j],dp[j-nums[i]]+nums[i])
    if target==dp[target]:
      return True
    return False