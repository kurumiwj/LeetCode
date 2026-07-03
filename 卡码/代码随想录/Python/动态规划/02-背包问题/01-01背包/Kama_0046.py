#46. 携带研究材料
from typing import *
import sys

def main():
  [m,n]=map(int,input().split())
  weight=list(map(int,input().split()))
  value=list(map(int,input().split()))
  dp:List[List[int]]=[[0]*(n+1) for x in range(m)]
  for j in range(weight[0],n+1):
    dp[0][j]=value[0]
  for i in range(1,m):
    for j in range(1,n+1):
      if j<weight[i]:
        dp[i][j]=dp[i-1][j]
      else:
        dp[i][j]=max(dp[i-1][j],dp[i-1][j-weight[i]]+value[i])
  print(dp[m-1][n])

if __name__=="__main__":
  main()