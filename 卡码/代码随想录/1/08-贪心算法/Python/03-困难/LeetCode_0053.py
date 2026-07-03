#53. 最大子数组和
from typing import *

class Solution:
  def maxSubArray(self, nums: List[int]) -> int:
    res:int=float("-inf")
    cnt:int=0
    for num in nums:
      cnt+=num
      if cnt>res:
        res=cnt
      if cnt<0:
        cnt=0
    return res