#39. 组合总和
from typing import *

class Solution:
  def __init__(self):
    self.path:List[int]=[]
    self.res:List[List[int]]=[]
  def backtracking(self,candidates:List[int],target:int,sum:int,index:int):
    if sum>target:
      return
    elif sum==target:
      self.res.append(self.path[:])
      return
    for i in range(index,len(candidates)):
      if sum+candidates[i]<=target:
        self.path.append(candidates[i])
        self.backtracking(candidates,target,sum+candidates[i],i)
        self.path.pop()
  def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
    candidates.sort()
    self.backtracking(candidates,target,0,0)
    return self.res