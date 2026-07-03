#376. 摆动序列
from typing import *

class Solution:
  def wiggleMaxLength(self, nums: List[int]) -> int:
    if len(nums)<=1:
      return len(nums)
    res:int=1
    pre:int=0
    cur:int=0
    for i in range(1,len(nums)):
      cur=nums[i]-nums[i-1]
      if cur>0 and pre<=0 or cur<0 and pre>=0:
        pre=cur
        res+=1
    return res