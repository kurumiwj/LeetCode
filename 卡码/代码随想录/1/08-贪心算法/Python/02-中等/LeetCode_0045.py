#45. 跳跃游戏 II
from typing import *

class Solution:
  def jump(self, nums: List[int]) -> int:
    res,cur,next=0,0,0
    for i in range(len(nums)-1):
      next=max(next,i+nums[i])
      if i==cur:
        cur=next
        res+=1
    return res