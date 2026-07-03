//110. 平衡二叉树
package main

import (
	"math"
	. "binaryTree/types"
)

func getHeight(root *TreeNode) int{
	if root==nil {
		return 0
	}
	leftHeight:=getHeight(root.Left)
	rightHeight:=getHeight(root.Right)
	if leftHeight==-1||rightHeight==-1 {
		return -1
	}
	if math.Abs(float64(leftHeight)-float64(rightHeight))>1 {
		return -1
	}else{
		return 1+int(math.Max(float64(leftHeight),float64(rightHeight)))
	}
}

func isBalanced(root *TreeNode) bool {
	if getHeight(root)==-1 {
		return false
	}else{
		return true
	}
}
