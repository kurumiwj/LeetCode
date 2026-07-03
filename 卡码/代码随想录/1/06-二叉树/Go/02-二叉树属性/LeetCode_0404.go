//404. 左叶子之和
package main

import (
	. "binaryTree/types"
)

func sumOfLeftLeaves(root *TreeNode) int {
	if root==nil {
		return 0
	}
	leftSum:=0
	if root.Left!=nil&&root.Left.Left==nil&&root.Left.Right==nil {
		leftSum=root.Left.Val
	}
	return leftSum+sumOfLeftLeaves(root.Left)+sumOfLeftLeaves(root.Right)
}
