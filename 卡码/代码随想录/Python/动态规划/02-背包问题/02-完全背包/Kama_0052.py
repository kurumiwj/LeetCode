#52. 携带研究材料
from typing import *
import sys

def main():
  [n,v]=map(int,input().split())
  weight:List[int]=[0]*n
  value:List[int]=[0]*n
  for i in range(n):
    [weight[i],value[i]]=map(int,input().split())
  dp:List[int]=[0]*(v+1)
  for i in range(n):
    for j in range(weight[i],v+1):
      dp[j]=max(dp[j],dp[j-weight[i]]+value[i])
  print(dp[v])

if __name__=="__main__":
  main()