//235. 二叉搜索树的最近公共祖先
package main

import (
	. "binaryTree/types"
)

func lowestCommonAncestor(root, p, q *TreeNode) *TreeNode {
	for root!=nil {
		if root.Val>p.Val&&root.Val>q.Val {
			root=root.Left
		}else if root.Val<p.Val&&root.Val<q.Val {
			root=root.Right
		}else{
			return root
		}
	}
	return nil
}
