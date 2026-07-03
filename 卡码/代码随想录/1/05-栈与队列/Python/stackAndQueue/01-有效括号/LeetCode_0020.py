#20. 有效的括号
from typing import *

class Solution:
  def isValid(self, s: str) -> bool:
    if len(s)%2!=0:
      return False
    stack=[]
    for ch in s:
      if ch=="(":
        stack.append(")")
      elif ch=="[":
        stack.append("]")
      elif ch=="{":
        stack.append("}")
      elif len(stack)==0 or stack[-1]!=ch:
        return False
      else:
        stack=stack[:-1]
    return len(stack)==0