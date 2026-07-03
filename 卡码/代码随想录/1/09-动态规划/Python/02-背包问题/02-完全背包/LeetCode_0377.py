#377. 组合总和 Ⅳ
from typing import *

class Solution:
  def combinationSum4(self, nums: List[int], target: int) -> int:
    dp:List[int]=[0]*(target+1)
    dp[0]=1
    for i in range(target+1):
      for num in nums:
        if i>=num:
          dp[i]+=dp[i-num]
    return dp[target]