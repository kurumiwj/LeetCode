//104. 二叉树的最大深度
package main

import (
	. "binaryTree/types"
)

func max(a,b int) int{
	if a>b {
		return a
	}else{
		return b
	}
}

func maxDepth(root *TreeNode) int {
	if root==nil {
		return 0
	}
	return 1+max(maxDepth(root.Left),maxDepth(root.Right))
}
