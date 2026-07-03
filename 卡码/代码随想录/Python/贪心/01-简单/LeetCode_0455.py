#455. 分发饼干
from typing import *

class Solution:
  def findContentChildren(self, g: List[int], s: List[int]) -> int:
    g.sort()
    s.sort()
    res:int=0
    index:int=len(s)-1
    for i in range(len(g)-1,-1,-1):
      if index<0:
        break
      if s[index]>=g[i]:
        res+=1
        index-=1
    return res