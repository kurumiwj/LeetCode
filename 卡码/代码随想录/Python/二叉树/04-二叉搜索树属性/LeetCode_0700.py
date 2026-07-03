#700. 二叉搜索树中的搜索
from typing import *
from ..TreeNode import *

class Solution:
  def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
    while root:
      if val<root.val:
        root=root.left
      elif val>root.val:
        root=root.right
      else:
        return root
    return None
