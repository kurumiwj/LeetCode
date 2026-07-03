//112. 路径总和
package main

import (
	. "binaryTree/types"
)

func hasPathSum(root *TreeNode, targetSum int) bool {
	if root==nil {
		return false
	}
	//如果当前节点是叶子节点且目标和与叶子节点值相等则找到路径
	if root.Left==nil&&root.Right==nil&&targetSum==root.Val {
		return true
	}
	return hasPathSum(root.Left,targetSum-root.Val)||hasPathSum(root.Right,targetSum-root.Val)
}
