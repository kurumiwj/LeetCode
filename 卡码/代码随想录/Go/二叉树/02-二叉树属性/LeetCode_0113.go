//113. 路径总和 II
package main

import (
	. "binaryTree/types"
)

var (
	res [][]int
	path []int
)

func traversal(root *TreeNode,targetSum int){
	if root==nil {
		return
	}
	path=append(path,root.Val)
	//叶子节点且sum等于当前节点值说明找到路径
	if root.Left==nil&&root.Right==nil&&targetSum==root.Val {
		tmp:=make([]int,len(path))
		copy(tmp,path)
		res=append(res,tmp)
	}
	traversal(root.Left,targetSum-root.Val)
	traversal(root.Right,targetSum-root.Val)
	path=path[:len(path)-1]
}

func pathSum(root *TreeNode, targetSum int) [][]int {
	res=make([][]int,0)
	path=make([]int,0)
	traversal(root,targetSum)
	return res
}
