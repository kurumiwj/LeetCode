#93. 复原 IP 地址
from typing import *

class Solution:
  def __init__(self):
    self.path:List[str]=[]
    self.res:List[str]=[]
  def isValid(self,s:str,start:int,end:int)->bool:
    if start>end or s[start]=='0' and start!=end:
      return False
    digit:int=int(s[start:end+1])
    if digit>255 or digit<0:
      return False
    return True
  def backtracking(self,s:str,index:int,dotNum:int):
    if index==len(s) and dotNum==4:
      self.res.append(".".join(self.path))
      return
    for i in range(index,len(s)):
      if i-index>=3 or not self.isValid(s,index,i):
        break
      else:
        self.path.append(s[index:i+1])
        self.backtracking(s,i+1,dotNum+1)
        self.path.pop()
  def restoreIpAddresses(self, s: str) -> List[str]:
    self.backtracking(s,0,0)
    return self.res