//700. 二叉搜索树中的搜索
package main

import (
	. "binaryTree/types"
)

func searchBST(root *TreeNode, val int) *TreeNode {
	for root!=nil {
		if val<root.Val {
			root=root.Left
		}else if val>root.Val {
			root=root.Right
		}else{
			return root
		}
	}
	return nil
}

func main{

}
