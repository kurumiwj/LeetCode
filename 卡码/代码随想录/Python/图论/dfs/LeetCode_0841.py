#841. 钥匙和房间
from typing import *

class Solution:
  def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
    visited:List[bool]=[False for _ in range(len(rooms))]
    def dfs(key):
      if visited[key]:
        return
      visited[key]=True
      keys:List[int]=rooms[key]
      for key in keys:
        if not visited[key]:
          dfs(key)      
    dfs(0)
    return all(visited)