#559. N 叉树的最大深度
from typing import *

class Node:
  def __init__(self, val=None, children=None):
    self.val = val
    self.children = children

class Solution:
  def maxDepth(self, root: 'Node') -> int:
    if not root:
      return 0
    depth=0
    for node in root.children:
      depth=max(depth,self.maxDepth(node))
    return 1+depth
