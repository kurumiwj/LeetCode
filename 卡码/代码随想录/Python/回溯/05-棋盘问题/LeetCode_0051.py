#51. N 皇后
from typing import *

class Solution:
  def __init__(self):
    self.chess:List[List[str]]=[]
    self.res:List[List[str]]=[]
  def isValid(self,row:int,col:int,n:int)->bool:
    for i in range(row):
      if self.chess[i][col]=='Q':
        return False
    i:int=row-1
    j:int=col-1
    while i>=0 and j>=0:
      if self.chess[i][j]=='Q':
        return False
      i,j=i-1,j-1
    i,j=row-1,col+1
    while i>=0 and j<n:
      if self.chess[i][j]=='Q':
        return False
      i,j=i-1,j+1
    return True
  def backtracking(self,row:int,n:int):
    if row==n:
      tmp:List[str]=[]
      for i in range(len(self.chess)):
        tmp.append("".join(self.chess[i]))
      self.res.append(tmp[:])
    for col in range(n):
      if self.isValid(row,col,n):
        self.chess[row][col]='Q'
        self.backtracking(row+1,n)
        self.chess[row][col]='.'
  def solveNQueens(self, n: int) -> List[List[str]]:
    self.chess=[['.']*n for _ in range(n)]
    self.backtracking(0,n)
    return self.res