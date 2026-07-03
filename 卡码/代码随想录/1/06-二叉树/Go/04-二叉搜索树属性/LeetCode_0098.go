//98. 验证二叉搜索树
package main

import (
	. "binaryTree/types"
)

func isValidBST(root *TreeNode) bool {
	var pre *TreeNode=nil
	var traversal func(node *TreeNode) bool
	traversal=func(node *TreeNode) bool{
		if node==nil {
			return true
		}
		left:=traversal(node.Left)
		if pre!=nil&&pre.Val>=node.Val {
			return false
		}
		pre=node
		right:=traversal(node.Right)
		return left&&right
	}
	return traversal(root)
}

func main(){

}
