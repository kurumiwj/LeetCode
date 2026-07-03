//501. 二叉搜索树中的众数
package main

import (
	. "binaryTree/types"
)

func findMode(root *TreeNode) []int {
	var pre *TreeNode=nil
	var res []int=make([]int,0)
	var count,maxCount=0,0
	var traversal func(root *TreeNode)
	traversal=func(root *TreeNode){
		if root==nil {
			return
		}
		traversal(root.Left)
		if pre==nil||pre.Val!=root.Val {
			count=1
		}else{
			count++
		}
		pre=root
		if count==maxCount {
			res=append(res,root.Val)
		}else if count>maxCount {
			maxCount=count
			res=[]int{root.Val}
		}
		traversal(root.Right)
		return
	}
	traversal(root)
	return res
}
