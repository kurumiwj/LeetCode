#647. 回文子串
from typing import *

class Solution:
  #动态规划
  def countSubstrings(self, s: str) -> int:
    dp:List[List[bool]]=[[False]*len(s) for _ in range(len(s))]
    res:int=0
    for i in range(len(s)-1,-1,-1):
      for j in range(i,len(s)):
        if s[i]==s[j] and (j-i<=1 or dp[i+1][j-1]):
          dp[i][j]=True
          res+=1
    return res
  #双指针
  def countSubstrings1(self, s: str) -> int:
    res:int=0
    for i in range(len(s)):
      res+=self.countPalindrome(s, i, i)
      res+=self.countPalindrome(s, i, i+1)
    return res
  def countPalindrome(self,s:str,i:int,j:int)->int:
    res:int=0
    while i>=0 and j<len(s) and s[i]==s[j]:
      i-=1
      j+=1
      res+=1
    return res