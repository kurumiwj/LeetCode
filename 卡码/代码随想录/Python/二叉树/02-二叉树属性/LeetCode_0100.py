#100. 相同的树
from typing import *
from ..TreeNode import *

class Solution:
  def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
    if p is not None and q is None:
      return False
    elif p is None and q is not None:
      return False
    elif p is None and q is None:
      return True
    elif p.val!=q.val:
      return False
    else:
      return self.isSameTree(p.left,q.left) and self.isSameTree(p.right,q.right)
