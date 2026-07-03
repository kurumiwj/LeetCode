#131. 分割回文串
from typing import *

class Solution:
  def __init__(self):
    self.path:List[str]=[]
    self.res:List[List[str]]=[]
  def isPalindrome(self,s:str,start:int,end:int)->bool:
    while start<end:
      if s[start]!=s[end]:
        return False
      start+=1
      end-=1
    return True
  def backtracking(self,s:str,index:int):
    if index>=len(s):
      self.res.append(self.path[:])
      return
    for i in range(index,len(s)):
      if self.isPalindrome(s,index,i):
        self.path.append(s[index:i+1])
      else:
        continue
      self.backtracking(s,i+1)
      self.path.pop()
  def partition(self, s: str) -> List[List[str]]:
    self.backtracking(s,0)
    return self.res