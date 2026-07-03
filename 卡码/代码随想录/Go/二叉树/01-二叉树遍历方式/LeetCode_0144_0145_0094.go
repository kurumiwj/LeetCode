//144-145-94.二叉树的前/后/中序遍历
package main

import (
	. "binaryTree/types"
)

//先序遍历
func preorderTraversal(root *TreeNode) []int {
	res:=make([]int,0)
	preOrder(root,&res)
	return res
}
func preOrder(root *TreeNode,v *[]int){
	if root==nil {
		return
	}
	*v=append(*v,root.Val)
	preOrder(root.Left,v)
	preOrder(root.Right,v)
}
//中序遍历
func inorderTraversal(root *TreeNode) []int {
	res:=make([]int,0)
	inOrder(root,&res)
	return res
}
func inOrder(root *TreeNode,v *[]int){
	if root==nil {
		return
	}
	inOrder(root.Left,v)
	*v=append(*v,root.Val)
	inOrder(root.Right,v)
}
//后序遍历
func postorderTraversal(root *TreeNode) []int {
	res:=make([]int,0)
	postOrder(root,&res)
	return res
}
func postOrder(root *TreeNode,v *[]int){
	if root==nil {
		return
	}
	postOrder(root.Left,v)
	postOrder(root.Right,v)
	*v=append(*v,root.Val)
}
