//515. 在每个树行中找最大值
package main

import (
	. "binaryTree/types"
)

func largestValues(root *TreeNode) []int {
	res:=make([]int,0)
	q:=make([]*TreeNode,0)
	if root!=nil {
		q=append(q,root)
	}
	for len(q)>0 {
		size:=len(q)
		max:=q[0].Val
		for size>0 {
			size--
			node:=q[0]
			q=q[1:]
			if max<node.Val {
				max=node.Val
			}
			if node.Left!=nil {
				q=append(q,node.Left)
			}
			if node.Right!=nil {
				q=append(q,node.Right)
			}
		}
		res=append(res,max)
	}
	return res
}
