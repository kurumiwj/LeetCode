//106. 从中序与后序遍历序列构造二叉树
package main

import (
	. "binaryTree/types"
)

func traversal(inOrder []int,inLeft,inRight int,postOrder []int,postLeft,postRight int) *TreeNode{
	if inLeft>inRight {
		return nil
	}
	root:=&TreeNode{postOrder[postRight],nil,nil}
	if inLeft==inRight{
		return root
	}
	rootIndex:=0
	for i:=inLeft;i<=inRight;i++ {
		if inOrder[i]==root.Val {
			rootIndex=i
			break
		}
	}
	leftLength:=rootIndex-inLeft
	root.Left=traversal(inOrder,inLeft,rootIndex-1,postOrder,postLeft,postLeft+leftLength-1)
	root.Right=traversal(inOrder,rootIndex+1,inRight,postOrder,postLeft+leftLength,postRight-1)
	return root
}
func buildTree(inorder []int, postorder []int) *TreeNode {
	if len(inorder)==0 || len(postorder)==0 {
		return nil
	}
	return traversal(inorder,0,len(inorder)-1,postorder,0,len(postorder)-1)
}
