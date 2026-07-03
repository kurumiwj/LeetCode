//450. 删除二叉搜索树中的节点
package main

import (
	. "binaryTree/types"
)

func deleteNode(root *TreeNode, key int) *TreeNode {
	if root==nil {
		return nil
	}
	if key<root.Val {
		root.Left=deleteNode(root.Left,key)
	}else if key>root.Val {
		root.Right=deleteNode(root.Right,key)
	}else{
		if root.Left==nil&&root.Right==nil {
			return nil
		}else if root.Left!=nil&&root.Right==nil {
			return root.Left
		}else if root.Left==nil&&root.Right!=nil {
			return root.Right
		}else{
			parent:=root
			tmp:=root.Right
			for tmp.Left!=nil {
				parent=tmp
				tmp=tmp.Left
			}
			root.Val=tmp.Val
			if parent==root {
				parent.Right=tmp.Right
			}else{
				parent.Left=tmp.Right
			}
		}
	}
	return root
}
