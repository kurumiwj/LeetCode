//102. 二叉树的层序遍历
package main

import (
	. "binaryTree/types"
)

func levelOrder(root *TreeNode) [][]int {
	v:=make([]int,0)
	res:=make([][]int,0)
	queue:=make([]*TreeNode,0)
	var size int
	if root!=nil {
		queue=append(queue,root)
	}
	for len(queue)!=0 {
		size=len(queue)
		v=[]int{}
		for size>0 {
			node:=queue[0]
			queue=queue[1:]
			v=append(v,node.Val)
			if node.Left!=nil {
				queue=append(queue,node.Left)
			}
			if node.Right!=nil {
				queue=append(queue,node.Right)
			}
			size--
		}
		res=append(res,v)
	}
	return res
}
