#509. 斐波那契数
from typing import *

class Solution:
  def fib(self, n: int) -> int:
    if n<=1:
      return n
    dp:List[int]=[0]*(n+1)
    dp[0],dp[1]=0,1
    for i in range(2,n+1):
      dp[i]=dp[i-1]+dp[i-2]
    return dp[n]