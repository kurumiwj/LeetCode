#491. 非递减子序列
from typing import *

class Solution:
  def __init__(self):
    self.path:List[int]=[]
    self.res:List[List[int]]=[]
  def backtracking(self,nums:List[int],index:int):
    if len(self.path)>1:
      self.res.append(self.path[:])
    hash:List[bool]=[False] * 201
    for i in range(index,len(nums)):
      if len(self.path)>0 and nums[i]<self.path[-1] or hash[nums[i]+100]:
        continue
      hash[nums[i]+100]=True
      self.path.append(nums[i])
      self.backtracking(nums,i+1)
      self.path.pop()
  def findSubsequences(self, nums: List[int]) -> List[List[int]]:
    self.backtracking(nums,0)
    return self.res