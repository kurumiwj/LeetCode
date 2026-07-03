#106. 从中序与后序遍历序列构造二叉树
from typing import *
from ..TreeNode import *

class Solution:
  def traversal(self,inOrder:List[int],inLeft:int,inRight:int,postOrder:List[int],postLeft:int,postRight:int)->Optional[TreeNode]:
    if inLeft>inRight:
      return None
    root:TreeNode=TreeNode(postOrder[postRight],None,None)
    if inLeft==inRight:
      return root
    rootIndex:int=0
    for i in range(inLeft,inRight+1):
      if inOrder[i]==root.val:
        rootIndex=i
        break
    leftLength:int=rootIndex-inLeft
    root.left=self.traversal(inOrder,inLeft,rootIndex-1,postOrder,postLeft,postLeft+leftLength-1)
    root.right=self.traversal(inOrder,rootIndex+1,inRight,postOrder,postLeft+leftLength,postRight-1)
    return root

  def buildTree(self, inorder: List[int], postorder: List[int]) -> Optional[TreeNode]:
    if len(inorder)==0 or len(postorder)==0:
      return None
    return self.traversal(inorder,0,len(inorder)-1,postorder,0,len(postorder)-1)
