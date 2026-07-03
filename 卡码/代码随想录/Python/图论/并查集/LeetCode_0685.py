#685. 冗余连接 II
from typing import *

class Solution:
  def findRedundantDirectedConnection(self, edges: List[List[int]]) -> List[int]:
    n:int=len(edges)
    father:List[int]=[]
    def init():
      nonlocal father
      father=[i for i in range(n+1)]
    def find(u:int)->int:
      if u==father[u]:
        return u
      else:
        father[u]=find(father[u])
        return father[u]
    def isSame(u:int,v:int)->bool:
      u=find(u)
      v=find(v)
      return u==v
    def join(u:int,v:int):
      u=find(u)
      v=find(v)
      if u==v:
        return
      father[v]=u
    def removeEdge()->List[int]:
      init()
      res:List[int]=[]
      for i in range(n):
        if isSame(edges[i][0],edges[i][1]):
          res=edges[i]
        else:
          join(edges[i][0],edges[i][1])
      return res
    def isTreeAfterRemoveEdge(delete:int)->bool:
      init()
      for i in range(n):
        if i==delete:
          continue
        if isSame(edges[i][0],edges[i][1]):
          return False
        join(edges[i][0],edges[i][1])
      return True
    inDegrees:List[int]=[0 for _ in range(n+1)]
    for i in range(n):
      inDegrees[edges[i][1]]+=1
    v2:List[int]=[]
    for i in range(n-1,-1,-1):
      if inDegrees[edges[i][1]]==2:
        v2.append(i)
    if len(v2)>1:
      if isTreeAfterRemoveEdge(v2[0]):
        return edges[v2[0]]
      else:
        return edges[v2[1]]
    return removeEdge()