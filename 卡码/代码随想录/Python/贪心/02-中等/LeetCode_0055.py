#55. 跳跃游戏
from typing import *

class Solution:
  def canJump(self, nums: List[int]) -> bool:
    if len(nums)==1:
      return True
    cover:int=0
    index:int=0
    while index<=cover:
      cover=max(cover,index+nums[index])
      if cover>=len(nums)-1:
        return True
      index+=1
    return False