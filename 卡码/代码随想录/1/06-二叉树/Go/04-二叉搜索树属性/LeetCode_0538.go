//538. 把二叉搜索树转换为累加树
package main

import (
	. "binaryTree/types"
)

func convertBST(root *TreeNode) *TreeNode {
	var pre=0
	var traversal func(root *TreeNode)
	traversal=func(root *TreeNode){
		if root==nil {
			return
		}
		traversal(root.Right)
		root.Val+=pre
		pre=root.Val
		traversal(root.Left)
	}
	traversal(root)
	return root
}
