#541. 反转字符串 II
from typing import *

class Solution:
  def reverseStr(self, s: str, k: int) -> str:
    s=list(s)
    for i in range(0,len(s),2*k):
      start=i
      end=min(start+k-1,len(s)-1)
      while start<end:
        s[start],s[end]=s[end],s[start]
        start+=1
        end-=1
    return "".join(s)