#738. 单调递增的数字
from typing import *

class Solution:
  def monotoneIncreasingDigits(self, n: int) -> int:
    nums:List[int]=list(str(n))
    start:int=len(nums)
    for i in range(len(nums)-1,0,-1):
      if nums[i-1]>nums[i]:
        nums[i-1]=str(int(nums[i-1])-1)
        start=i
    for i in range(start,len(nums)):
      nums[i]=9
    nums="".join(nums[:start])+'9'*(len(nums)-start)
    return int(nums)