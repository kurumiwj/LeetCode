//111. 二叉树的最小深度
package main

import (
	. "binaryTree/types"
)

func minDepth(root *TreeNode) int {
	if root==nil {
		return 0
	}
	if root.Left==nil&&root.Right!=nil {
		return 1+min(minDepth(root.Right))
	}
	if root.Left!=nil&&root.Right==nil {
		return 1+min(minDepth(root.Left))
	}
	return 1+min(minDepth(root.Left),minDepth(root.Right))
}
