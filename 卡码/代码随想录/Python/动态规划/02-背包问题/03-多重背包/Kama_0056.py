#56. 携带矿石资源
from typing import *

def main():
  [c,n]=map(int,input().split())
  w:List[int]=list(map(int,input().split()))
  v:List[int]=list(map(int,input().split()))
  k:List[int]=list(map(int,input().split()))
  dp:List[int]=[0]*(c+1)
  for i in range(n):
    for j in range(c,w[i]-1,-1):
      for l in range(1,k[i]+1):
        if j<l*w[i]:
          break
        dp[j]=max(dp[j],dp[j-l*w[i]]+l*v[i])
  print(dp[c])

if __name__=="__main__":
  main()