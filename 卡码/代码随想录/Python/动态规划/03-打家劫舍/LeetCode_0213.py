#213. 打家劫舍 II
from typing import *

class Solution:
  def rob0(self, nums: List[int],start:int,end:int) -> int:
    if end-start==1:
      return nums[start]
    dp:List[int]=[0]*(len(nums))
    dp[start]=nums[start]
    if end-start>1:
      dp[start+1]=max(nums[start],nums[start+1])
    for i in range(start+2,end):
      dp[i]=max(dp[i-1],dp[i-2]+nums[i])
    return dp[end-1]
  def rob(self, nums: List[int]) -> int:
    if len(nums)==1:
      return nums[0]
    return max(self.rob0(nums,0,len(nums)-1),self.rob0(nums,1,len(nums)))