#236. 二叉树的最近公共祖先
from typing import *
from ..TreeNode import *

class Solution:
  def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
    if not root or root==p or root==q:
      return root
    left:TreeNode=self.lowestCommonAncestor(root.left,p,q)
    right:TreeNode=self.lowestCommonAncestor(root.right,p,q)
    if left and right:
      return root
    elif not left and right:
      return right
    elif left and not right:
      return left
    else:
      return None
