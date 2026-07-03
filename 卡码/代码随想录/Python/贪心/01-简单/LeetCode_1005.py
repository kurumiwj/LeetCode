#1005. K 次取反后最大化的数组和
from typing import *

class Solution:
  def largestSumAfterKNegations(self, nums: List[int], k: int) -> int:
    nums.sort(key=lambda x:abs(x),reverse=True)
    res:int=0
    for i in range(len(nums)):
      if k>0 and nums[i]<0:
        nums[i]=-nums[i]
        k-=1
      res+=nums[i]
    if k%2==1:
      res-=2*nums[len(nums)-1]
    return res