#450. 删除二叉搜索树中的节点
from typing import *
from ..TypeNode import *

class Solution:
  def deleteNode(self, root: Optional[TreeNode], key: int) -> Optional[TreeNode]:
    if not root:
      return None
    if key<root.val:
      root.left=self.deleteNode(root.left,key)
    elif key>root.val:
      root.right=self.deleteNode(root.right,key)
    else:
      if not root.left and not root.right:
        return None
      elif root.left and not root.right:
        return root.left
      elif not root.left and root.right:
        return root.right
      else:
        parent:TreeNode=root
        tmp:TreeNode=root.right
        while tmp.left:
          parent=tmp
          tmp=tmp.left
        root.val=tmp.val
        if parent==root:
          parent.right=tmp.right
        else:
          parent.left=tmp.right
    return root
