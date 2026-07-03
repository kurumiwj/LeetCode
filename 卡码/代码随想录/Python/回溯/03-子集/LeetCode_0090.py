#90. 子集 II
from typing import *

class Solution:
  def __init__(self):
    self.path:List[int]=[]
    self.res:List[List[int]]=[]
  
  def backtracking(self,nums:List[int],index:int):
    self.res.append(self.path[:])
    for i in range(index,len(nums)):
      if i>index and nums[i]==nums[i-1]:
        continue
      self.path.append(nums[i])
      self.backtracking(nums,i+1)
      self.path.pop()
  
  def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
    nums.sort()
    self.backtracking(nums,0)
    return self.res