#135. 分发糖果
from typing import *

class Solution:
  def candy(self, ratings: List[int]) -> int:
    can:List[int]=[1]*len(ratings)
    for i in range(1,len(ratings)):
      if ratings[i]>ratings[i-1]:
        can[i]=can[i-1]+1
    for i in range(len(ratings)-2,-1,-1):
      if ratings[i]>ratings[i+1]:
        can[i]=max(can[i+1]+1,can[i])
    return sum(can)