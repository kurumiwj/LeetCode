#57. 爬楼梯
from typing import *
import sys

def main():
  n,m=map(int,input().split())
  dp:List[int]=[0]*(n+1)
  dp[0]=1
  for i in range(1,n+1):
    for j in range(1,m+1):
      if i>=j:
        dp[i]+=dp[i-j]
      else:
        break
  print(dp[n])

if __name__=="__main__":
  main()