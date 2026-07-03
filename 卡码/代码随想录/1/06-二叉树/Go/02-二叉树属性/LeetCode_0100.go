//100. 相同的树
package main

import (
	. "binaryTree/types"
)

func isSameTree(p *TreeNode, q *TreeNode) bool {
	if p==nil&&q!=nil {
		return false
	}else if p!=nil&&q==nil {
		return false
	}else if p==nil&&q==nil {
		return true
	}else if p.Val!=q.Val {
		return false
	}else{
		return isSameTree(p.Left,q.Left)&&isSameTree(p.Right,q.Right)
	}
}
