//101. 对称二叉树
package main

import (
	. "binaryTree/types"
)

func compare(left,right *TreeNode) bool{
	if left!=nil&&right==nil {
		return false
	}else if left==nil&&right!=nil {
		return false
	}else if left==nil&&right==nil {
		return true
	}else if left.Val!=right.Val {
		return false
	}else{
		return compare(left.Left,right.Right)&&compare(left.Right,right.Left)
	}
}

func isSymmetric(root *TreeNode) bool {
	if root==nil {
		return true
	}else{
		return compare(root.Left,root.Right)
	}
}
