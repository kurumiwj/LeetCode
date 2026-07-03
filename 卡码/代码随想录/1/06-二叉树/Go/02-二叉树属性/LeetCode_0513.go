//513. 找树左下角的值
package main

import (
	. "binaryTree/types"
)

var maxDepth,res=-1,0
func traversal(root *TreeNode,depth int){
	if root.Left==nil&&root.Right==nil {
		if depth>maxDepth {
			maxDepth=depth
			res=root.Val
		}
		return
	}
	if root.Left!=nil {
		traversal(root.Left,depth+1)
	}
	if root.Right!=nil {
		traversal(root.Right,depth+1)
	}
	return
}
func findBottomLeftValue(root *TreeNode) int {
	maxDepth,res=-1,0
	traversal(root,0)
	return res
}

// func findBottomLeftValue(root *TreeNode) int {
// 	q:=make([]*TreeNode,0)
// 	if root!=nil {
// 		q=append(q,root)
// 	}
// 	res:=0
// 	for len(q)>0 {
// 		size:=len(q)
// 		for i:=0;i<size;i++ {
// 			node:=q[0]
// 			q=q[1:]
// 			if i==0 {
// 				res=node.Val
// 			}
// 			if node.Left!=nil {
// 				q=append(q,node.Left)
// 			}
// 			if node.Right!=nil {
// 				q=append(q,node.Right)
// 			}
// 		}
// 	}
// 	return res
// }
