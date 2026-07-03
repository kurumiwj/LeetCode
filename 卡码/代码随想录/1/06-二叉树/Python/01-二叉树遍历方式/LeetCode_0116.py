#116. 填充每个节点的下一个右侧节点指针
from typing import *

class Node:
  def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
    self.val = val
    self.left = left
    self.right = right
    self.next = next

class Solution:
  def connect(self, root: 'Optional[Node]') -> 'Optional[Node]':
    q:List[Node]=[]
    cur:Node=None
    pre:Node=None
    if root!=None:
      q.append(root)
    while len(q)>0:
      size:int=len(q)
      for i in range(size):
        cur=q[0]
        q=q[1:]
        if i!=0:
          pre.next=cur
        pre=cur
        if cur.left!=None:
          q.append(cur.left)
        if cur.right!=None:
          q.append(cur.right)
    return root