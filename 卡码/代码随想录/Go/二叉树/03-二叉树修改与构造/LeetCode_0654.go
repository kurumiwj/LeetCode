//654. 最大二叉树
package main

import (
	. "binaryTree/types"
)

func traversal(nums []int,left,right int) *TreeNode{
	if left>=right {
		return nil
	}
	maxIndex:=left
	for i:=left;i<right;i++ {
		if nums[i]>nums[maxIndex] {
			maxIndex=i
		}
	}
	root:=&TreeNode{nums[maxIndex],nil,nil}
	root.Left=traversal(nums,left,maxIndex)
	root.Right=traversal(nums,maxIndex+1,right)
	return root
}
func constructMaximumBinaryTree(nums []int) *TreeNode {
	return traversal(nums,0,len(nums))
}
