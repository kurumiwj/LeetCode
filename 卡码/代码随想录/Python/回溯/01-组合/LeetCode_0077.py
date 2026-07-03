#77. 组合
from typing import *

class Solution:
  def __init__(self):
    self.res:List[List[int]]=[]
    self.path:List[int]=[]
  def backtracking(self,n:int,k:int,index:int):
    if k==len(self.path):
      self.res.append(self.path[:])
      return
    for i in range(index,n+2-(k-len(self.path))):
      self.path.append(i)
      self.backtracking(n,k,i+1)
      self.path.pop()
  def combine(self, n: int, k: int) -> List[List[int]]:
    self.backtracking(n,k,1)
    return self.res