#78. 子集
from typing import *

class Solution:
  def __init__(self):
    self.path:List[int]=[]
    self.res:List[List[int]]=[]
  def backtracking(self,nums:List[int],index:int):
    self.res.append(self.path[:])
    if index>len(nums):
      return
    for i in range(index,len(nums)):
      self.path.append(nums[i])
      self.backtracking(nums,i+1)
      self.path.pop()
  def subsets(self, nums: List[int]) -> List[List[int]]:
    self.backtracking(nums,0)
    return self.res