//105. 从前序与中序遍历序列构造二叉树
package main

import (
	. "binaryTree/types"
)

func traversal(preOrder []int,preLeft,preRight int,inOrder []int,inLeft,inRight int) *TreeNode{
	if inLeft>inRight {
		return nil
	}
	root:=&TreeNode{preOrder[preLeft],nil,nil}
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
	root.Left=traversal(preOrder,preLeft+1,preLeft+leftLength,inOrder,inLeft,rootIndex-1)
	root.Right=traversal(preOrder,preLeft+leftLength+1,preRight,inOrder,rootIndex+1,inRight)
	return root
}

func buildTree(preorder []int, inorder []int) *TreeNode {
	if len(preorder)==0||len(inorder)==0{
		return nil
	}
	return traversal(preorder,0,len(preorder)-1,inorder,0,len(inorder)-1)
}
