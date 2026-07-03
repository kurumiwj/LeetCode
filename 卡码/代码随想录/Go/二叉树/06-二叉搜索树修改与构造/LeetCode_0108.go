//108. 将有序数组转换为二叉搜索树
package main

import (
	. "binaryTree/types"
)

func traversal(nums []int,left,right int) *TreeNode{
	if left>right {
		return nil
	}
	mid:=(left+right)/2
	root:=&TreeNode{nums[mid],nil,nil}
	root.Left=traversal(nums,left,mid-1)
	root.Right=traversal(nums,mid+1,right)
	return root
}

func sortedArrayToBST(nums []int) *TreeNode {
	return traversal(nums,0,len(nums)-1)
}
