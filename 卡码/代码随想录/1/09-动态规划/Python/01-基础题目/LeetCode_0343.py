#343. 整数拆分
from typing import *

class Solution:
  def integerBreak(self, n: int) -> int:
    dp:List[int]=[0]*(n+1)
    dp[0],dp[1],dp[2]=0,0,1
    for i in range(3,n+1):
      for j in range(1,i//2+1):
        dp[i]=max(dp[i],max(j*(i-j),j*dp[i-j]))
    return dp[n]