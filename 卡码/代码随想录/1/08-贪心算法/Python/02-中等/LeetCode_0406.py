#406. 根据身高重建队列
from typing import *

class Solution:
  def reconstructQueue(self, people: List[List[int]]) -> List[List[int]]:
    q:List[List[int]]=[]
    people.sort(key=lambda p:(-p[0],p[1]))
    for p in people:
      q.insert(p[1],p)
    return q