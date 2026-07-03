//107. 二叉树的层序遍历 II
package main

import (
	"slices"
	. "binaryTree/types"
)

func levelOrderBottom(root *TreeNode) [][]int {
	queue:=make([]*TreeNode,0)
	res:=make([][]int,0)
	if root!=nil {
		queue=append(queue,root)
	}
	var size int
	for len(queue)>0 {
		size=len(queue)
		v:=make([]int,0)
		for size>0 {
			size--
			node:=queue[0]
			queue=queue[1:]
			v=append(v,node.Val)
			if node.Left!=nil {
				queue=append(queue,node.Left)
			}
			if node.Right!=nil {
				queue=append(queue,node.Right)
			}
		}
		res=append(res,v)
	}
	slices.Reverse(res)
	return res
}
