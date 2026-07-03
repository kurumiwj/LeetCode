#763. 划分字母区间
from typing import *

class Solution:
  def partitionLabels(self, s: str) -> List[int]:
    left,right=0,0
    hash:List[int]=[0]*30
    res:List[int]=[]
    for i in range(len(s)):
      hash[ord(s[i])-ord('a')]=i
    for i in range(len(s)):
      right=max(right,hash[ord(s[i])-ord('a')])
      if i==right:
        res.append(right-left+1)
        left=i+1
    return res