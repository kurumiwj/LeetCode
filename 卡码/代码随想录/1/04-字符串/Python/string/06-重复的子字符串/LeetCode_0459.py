#459. 重复的子字符串
class Solution:
  def repeatedSubstringPattern(self, s: str) -> bool:
    #法一
    n=len(s)
    # s1=s+s
    # return s1[1:2*n-1].find(s)!=-1
    #法二
    next=[0 for x in range(n)]
    j=0
    for i in range(1,n):
      while j>0 and s[i]!=s[j]:
        j=next[j-1]
      if s[i]==s[j]:
        j+=1
      next[i]=j
    return next[n-1]!=0 and n%(n-next[n-1])==0