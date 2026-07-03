//236. 二叉树的最近公共祖先
package main

import (
	. "binaryTree/types"
)

func lowestCommonAncestor(root, p, q *TreeNode) *TreeNode {
  if root==nil||root==p||root==q {
		return root
	}
	left:=lowestCommonAncestor(root.Left,p,q)
	right:=lowestCommonAncestor(root.Right,p,q)
	if left!=nil&&right!=nil {
		return root
	}else if left==nil&&right!=nil {
		return right
	}else if left!=nil&&right==nil {
		return left
	}else{
		return nil
	}
}
