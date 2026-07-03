#105. 从前序与中序遍历序列构造二叉树
from typing import *
from ..TreeNode import *

class Solution:
  def traversal(self,preOrder:List[int],preLeft:int,preRight:int,inOrder:List[int],inLeft:int,inRight:int)->Optional[TreeNode]:
    if inLeft>inRight:
      return None
    root:TreeNode=TreeNode(preOrder[preLeft],None,None)
    if inLeft==inRight:
      return root
    rootIndex:int=0
    for i in range(inLeft,inRight+1):
      if inOrder[i]==root.val:
        rootIndex=i
        break
    leftLength:int=rootIndex-inLeft
    root.left=self.traversal(preOrder,preLeft+1,preLeft+leftLength,inOrder,inLeft,rootIndex-1)
    root.right=self.traversal(preOrder,preLeft+leftLength+1,preRight,inOrder,rootIndex+1,inRight)
    return root

  def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
    if len(inorder)==0 or len(preorder)==0:
      return None
    return self.traversal(preorder,0,len(preorder)-1,inorder,0,len(inorder)-1)
