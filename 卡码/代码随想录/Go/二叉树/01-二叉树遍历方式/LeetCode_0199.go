//199. 二叉树的右视
package main

import (
	. "binaryTree/types"
)

func rightSideView(root *TreeNode) []int {
	res:=make([]int,0)
	q:=make([]*TreeNode,0)
	if root!=nil {
		q=append(q,root)
	}
	var size int
	for len(q)>0 {
		size=len(q)
		for i:=0;i<size;i++ {
			node:=q[0]
			q=q[1:]
			if i==size-1 {
				res=append(res,node.Val)
			}
			if node.Left!=nil {
				q=append(q,node.Left)
			}
			if node.Right!=nil {
				q=append(q,node.Right)
			}
		}
	}
	return res
}
