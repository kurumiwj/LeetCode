//104. 二叉树的最大深度
package main

import (
	"container/list"
	. "binaryTree/types"
)

func maxDepth(root *TreeNode) int {
	q:=list.New()
	var depth int
	if root!=nil {
		q.PushBack(root)
	}
	for q.Len()>0 {
		size:=q.Len()
		depth++
		for size>0 {
			size--
			node:=q.Remove(q.Front()).(*TreeNode)
			if node.Left!=nil {
				q.PushBack(node.Left)
			}
			if node.Right!=nil {
				q.PushBack(node.Right)
			}
		}
	}
	return depth
}
