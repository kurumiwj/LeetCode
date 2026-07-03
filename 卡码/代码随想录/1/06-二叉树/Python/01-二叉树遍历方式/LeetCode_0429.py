#429. N 叉树的层序遍历
from typing import *

class Node:
  def __init__(self, val=None, children=None):
    self.val = val
    self.children = children

class Solution:
  def levelOrder(self, root: 'Node') -> List[List[int]]:
    res:List[List[int]]=[]
    q:List[Node]=[]
    if root!=None:
      q.append(root)
    while len(q)>0:
      size:int=len(q)
      v:List[int]=[]
      for i in range(size):
        node:Node=q[0]
        q=q[1:]
        v.append(node.val)
        for child in node.children:
          q.append(child)
      res.append(v)
    return res