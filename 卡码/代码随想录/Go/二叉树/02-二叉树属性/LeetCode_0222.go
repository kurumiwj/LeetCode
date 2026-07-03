//222. 完全二叉树的节点个数
package main

import (
	. "binaryTree/types"
)

func countNodes(root *TreeNode) int {
	if root==nil {
		return 0
	}
	var left,right=root.Left,root.Right
	var leftDepth,rightDepth=0,0
	for left!=nil {
		left=left.Left
		leftDepth++
	}
	for right!=nil {
		right=right.Right
		rightDepth++
	}
	if leftDepth==rightDepth {
		return (2<<leftDepth)-1
	}
	return 1+countNodes(root.Left)+countNodes(root.Right)
}
