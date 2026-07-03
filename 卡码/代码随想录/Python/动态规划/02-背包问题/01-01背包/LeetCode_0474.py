#474. 一和零
from typing import *

class Solution:
  def findMaxForm(self, strs: List[str], m: int, n: int) -> int:
    dp:List[List[int]]=[[0]*(n+1) for x in range(m+1)]
    for str in strs:
      x,y=0,0
      for ch in str:
        if ch=="0":
          x+=1
        else:
          y+=1
      for i in range(m,x-1,-1):
        for j in range(n,y-1,-1):
          dp[i][j]=max(dp[i][j],dp[i-x][j-y]+1)
    return dp[m][n]