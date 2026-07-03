#257. 二叉树的所有路径
from typing import *
from ..TreeNode import *

class Solution:
  def traversal(self,root:Optional[TreeNode],path:str,res:List[str]):
    path+=str(root.val)
    #找到叶子节点
    if not root.left and not root.right:
      res.append(path)
      return
    if root.left:
      self.traversal(root.left,path+"->",res)
    if root.right:
      self.traversal(root.right,path+"->",res)

  def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
    res:List[str]=[]
    path:str=""
    if not root:
      return res
    self.traversal(root,path,res)
    return res
