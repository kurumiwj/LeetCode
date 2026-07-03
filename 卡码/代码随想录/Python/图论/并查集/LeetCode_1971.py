#1971. 寻找图中是否存在路径
from typing import *

class Solution:
  def __init__(self):
    self.father:List[int]=[]
  def init(self,n:int):
    self.father=[i for i in range(n)]
  def find(self,u:int)->int:
    if u==self.father[u]:
      return u
    else:
      self.father[u]=self.find(self.father[u])
      return self.father[u]
  def isSame(self,u:int,v:int):
    u=self.find(u)
    v=self.find(v)
    return u==v
  def join(self,u:int,v:int):
    u=self.find(u)
    v=self.find(v)
    if u==v:
      return
    self.father[u]=v
  def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
    self.init(n)
    for i in range(len(edges)):
      self.join(edges[i][0],edges[i][1])
    return self.isSame(source,destination)