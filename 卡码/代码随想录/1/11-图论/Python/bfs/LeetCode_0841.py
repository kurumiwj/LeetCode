#841. 钥匙和房间
from typing import *
from collections import deque

class Solution:
  def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
    def bfs()->bool:
      visited:List[bool]=[False for _ in range(len(rooms))]
      q:deque[int]=deque()
      q.append(0)
      visited[0]=True
      while len(q)>0:
        k:int=q.popleft()
        keys:List[int]=rooms[k]
        for key in keys:
          if not visited[key]:
            visited[key]=True
            q.append(key)
      return all(visited)
    return bfs()