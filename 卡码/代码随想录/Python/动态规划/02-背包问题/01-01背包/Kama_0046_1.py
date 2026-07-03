#46. 携带研究材料
from typing import *
import sys

def main():
  [m,n]=map(int,input().split())
  weight=list(map(int,input().split()))
  value=list(map(int,input().split()))
  dp:List[int]=[0]*(n+1)
  for i in range(m):
    for j in range(n,weight[i]-1,-1):
      dp[j]=max(dp[j],dp[j-weight[i]]+value[i])
  print(dp[n])

if __name__=="__main__":
  main()