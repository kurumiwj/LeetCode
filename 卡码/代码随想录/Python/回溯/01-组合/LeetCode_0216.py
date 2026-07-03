#216. 组合总和 III
from typing import *

class Solution:
  def __init__(self):
    self.path:List[int]=[]
    self.res:List[List[int]]=[]
  def backtracking(self,k:int,n:int,sum:int,index:int):
    if sum>n:
      return
    if k==len(self.path):
      if sum==n:
        self.res.append(self.path[:])
      return
    for i in range(index,11-(k-len(self.path))):
      self.path.append(i)
      self.backtracking(k,n,sum+i,i+1)
      self.path.pop()
  def combinationSum3(self, k: int, n: int) -> List[List[int]]:
    self.backtracking(k,n,0,1)
    return self.res