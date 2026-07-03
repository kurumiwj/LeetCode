//572. 另一棵树的子树
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
		return compare(left.Left,right.Left)&&compare(left.Right,right.Right)
	}
}

func isSubtree(root *TreeNode, subRoot *TreeNode) bool {
	if root==nil {
		return false
	}else{
		return compare(root,subRoot)||isSubtree(root.Left,subRoot)||isSubtree(root.Right,subRoot)
	}
}
