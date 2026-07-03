#17. 电话号码的字母组合
from typing import *

class Solution:
  def __init__(self):
    self.nums=["","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"]
    self.res=[]
  def backtracking(self,digits:str,index:int,tmp:str):
    if index==len(digits):
      self.res.append(tmp)
      return
    digit:int=int(digits[index])
    letter:str=self.nums[digit]
    for ch in letter:
      self.backtracking(digits,index+1,tmp+ch)
  def letterCombinations(self, digits: str) -> List[str]:
    if len(digits)!=0:
      self.backtracking(digits,0,"")
    return self.res