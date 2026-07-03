#684. 冗余连接
from typing import *

class Solution:
  def __init__(self):
    self.father:List[int]=[]
  def init(self,n:int):
    self.father=[i for i in range(n+1)]
  def find(self,u:int)->int:
    if u==self.father[u]:
      return u
    self.father[u]=self.find(self.father[u])
    return self.father[u]
  def isSame(self,u:int,v:int)->bool:
    u=self.find(u)
    v=self.find(v)
    return u==v
  def join(self,u:int,v:int):
    u=self.find(u)
    v=self.find(v)
    if u==v:
      return
    self.father[v]=u
  def findRedundantConnection(self, edges: List[List[int]]) -> List[int]:
    n:int=len(edges)
    self.init(n)
    res:List[int]=[]
    for edge in edges:
      if self.isSame(edge[0],edge[1]):
        res=edge
      else:
        self.join(edge[0],edge[1])
    return res