#150. 逆波兰表达式求值
from typing import *
import math

class Solution:
  def evalRPN(self, tokens: List[str]) -> int:
    nums:List[int]=[]
    for token in tokens:
      if token=="+" or token=="-" or token=="*" or token=="/":
        n2=nums.pop()
        n1=nums.pop()
        if token=="+":
          nums.append(n1+n2)
        elif token=="-":
          nums.append(n1-n2)
        elif token=="*":
          nums.append(n1*n2)
        else:
          num=n1/n2
          nums.append(math.floor(num) if num>0 else math.ceil(num))
      else:
        nums.append(int(token))
    return nums[-1]