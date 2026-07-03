#28. 找出字符串中第一个匹配项的下标
class Solution:
  def strStr(self, haystack: str, needle: str) -> int:
    next=[0 for x in range(len(needle))]
    j=0
    for i in range(1,len(needle)):
      while j>0 and needle[j]!=needle[i]:
        j=next[j-1]
      if needle[j]==needle[i]:
        j+=1
      next[i]=j
    j=0
    for i in range(len(haystack)):
      while j>0 and needle[j]!=haystack[i]:
        j=next[j-1]
      if needle[j]==haystack[i]:
        j+=1
      if j==len(needle):
        return i-j+1
    return -1