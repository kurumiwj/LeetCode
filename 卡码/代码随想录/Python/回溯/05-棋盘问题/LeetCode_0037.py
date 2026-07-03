#37. 解数独
from typing import *

class Solution:
  def isValid(self,row:int,col:int,ch:str,board:List[List[str]])->bool:
    for i in range(9):
      if board[row][i]==ch or board[i][col]==ch:
        return False
    startRow:int=row//3*3
    startCol:int=col//3*3
    for i in range(startRow,startRow+3):
      for j in range(startCol,startCol+3):
        if board[i][j]==ch:
          return False
    return True
  def backtracking(self,board:List[List[str]]):
    for i in range(9):
      for j in range(9):
        if board[i][j]==".":
          for k in range(ord("1"),ord("9")+1):
            if self.isValid(i,j,chr(k),board):
              board[i][j]=chr(k)
              if self.backtracking(board):
                return True
              board[i][j]="."
          return False
    return True
  def solveSudoku(self, board: List[List[str]]) -> None:
    self.backtracking(board)