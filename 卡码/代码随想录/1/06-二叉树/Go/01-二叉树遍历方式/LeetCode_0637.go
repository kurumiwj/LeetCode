//637. 二叉树的层平均值
package main

import (
	. "binaryTree/types"
)

func averageOfLevels(root *TreeNode) []float64 {
	res:=make([]float64,0)
	q:=make([]*TreeNode,0)
	var size,sum int
	if root!=nil {
		q=append(q,root)
	}
	for len(q)>0 {
		size=len(q)
		sum=0
		for i:=0;i<size;i++ {
			node:=q[0]
			q=q[1:]
			sum+=node.Val
			if node.Left!=nil {
				q=append(q,node.Left)
			}
			if node.Right!=nil {
				q=append(q,node.Right)
			}
		}
		res=append(res,float64(sum)/float64(size))
	}
	return res
}
