#417. 太平洋大西洋水流问题
from typing import *
from collections import deque

class Solution:
  def __init__(self):
    self.dir:List[List[int]]=[[0,1],[1,0],[0,-1],[-1,0]]
    self.visited:List[List[List[bool]]]=[]
    self.q:List[tuple[int,int,int]]=[]
  def bfs(self,heights:List[List[int]]):
    while len(self.q)>0:
      v:tuple[int,int,int]=self.q.pop()
      for i in range(4):
        x,y=v[1]+self.dir[i][0],v[2]+self.dir[i][1]
        if x<0 or x>len(heights)-1 or y<0 or y>len(heights[0])-1:
          continue
        if self.visited[v[0]][x][y] or heights[x][y]<heights[v[1]][v[2]]:
          continue
        self.visited[v[0]][x][y]=True
        self.q.append((v[0],x,y))
  def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
    n,m=len(heights),len(heights[0])
    self.visited=[[[False]*m for _ in range(n)] for _ in range(2)]
    for i in range(n):
      self.visited[0][i][0]=True
      self.visited[1][i][m-1]=True
      self.q.append((0,i,0))
      self.q.append((1,i,m-1))
    for j in range(m):
      self.visited[0][0][j]=True
      self.visited[1][n-1][j]=True
      self.q.append((0,0,j))
      self.q.append((1,n-1,j))
    self.bfs(heights)
    res:List[List[int]]=[]
    for i in range(n):
      for j in range(m):
        if self.visited[0][i][j] and self.visited[1][i][j]:
          res.append([i,j])
    return res