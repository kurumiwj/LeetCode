#62. 不同路径
from typing import *

class Solution:
  def uniquePaths(self, m: int, n: int) -> int:
    dp:List[List[int]]=[[1]*n]*m
    for i in range(1,m):
      for j in range(1,n):
        dp[i][j]=dp[i-1][j]+dp[i][j-1]
    return dp[m-1][n-1]