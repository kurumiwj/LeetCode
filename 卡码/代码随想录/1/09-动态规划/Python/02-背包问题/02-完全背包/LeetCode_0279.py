#279. 完全平方数
from typing import *

class Solution:
  def numSquares(self, n: int) -> int:
    dp:List[int]=[float("inf")-1]*(n+1)
    dp[0]=0
    for i in range(1,floor(sqrt(n))+1):
      for j in range(i*i,n+1):
        dp[j]=min(dp[j],dp[j-i*i]+1)
    return dp[n]