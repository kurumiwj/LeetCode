#827. 最大人工岛
from typing import *

class Solution:
  def __init__(self):
    self.dir:List[List[int]]=[[0,1],[1,0],[0,-1],[-1,0]]
    self.cnt:int = 0
  def dfs(self, grid: List[List[int]], x: int, y: int, mark: int):
    self.cnt += 1
    grid[x][y] = mark
    for i in range(4):
      nextX, nextY = x + self.dir[i][0], y + self.dir[i][1]
      if nextX < 0 or nextX > len(grid) - 1 or nextY < 0 or nextY > len(grid[0]) - 1:
        continue
      if grid[nextX][nextY] == 0 or grid[nextX][nextY] > 1:
        continue
      self.dfs(grid, nextX, nextY, mark)
  def largestIsland(self, grid: List[List[int]]) -> int:
    n, m = len(grid), len(grid[0])
    areas: dict[int, int] = dict()
    isAllLand: bool = True
    mark: int = 2
    for i in range(n):
      for j in range(m):
        if grid[i][j] == 0:
          isAllLand = False
        if grid[i][j] == 1:
          self.cnt = 0
          self.dfs(grid, i, j, mark)
          areas[mark] = self.cnt
          mark += 1
    if isAllLand:
      return n * m
    visited: set[int] = set()
    res: int = 0
    for i in range(n):
      for j in range(m):
        if grid[i][j] == 0:
          count: int = 1
          visited.clear()
          for k in range(4):
            x, y = i + self.dir[k][0], j + self.dir[k][1]
            if x < 0 or x > n - 1 or y < 0 or y > m - 1:
              continue
            if grid[x][y] in visited:
              continue
            visited.add(grid[x][y])
            count += areas.get(grid[x][y], 0)
          res = max(res, count)
    return res