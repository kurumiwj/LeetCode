#463. 岛屿的周长
from typing import *

class Solution:
  def islandPerimeter(self, grid: List[List[int]]) -> int:
    dir:List[List[int]]=[[0,1],[1,0],[0,-1],[-1,0]]
    n,m=len(grid),len(grid[0])
    res:int=0
    for i in range(n):
      for j in range(m):
        if grid[i][j]:
          for k in range(4):
            x,y=i+dir[k][0],j+dir[k][1]
            if x<0 or x>n-1 or y<0 or y>m-1 or grid[x][y]==0:
              res+=1
    return res