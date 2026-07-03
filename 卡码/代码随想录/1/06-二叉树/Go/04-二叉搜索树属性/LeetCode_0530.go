// 530. 二叉搜索树的最小绝对差
package main

import (
	. "binaryTree/types"
	"math"
)

func getMinimumDifference(root *TreeNode) int {
	var res=math.MaxInt
	var pre *TreeNode=nil
	var traversal func(root *TreeNode)
	traversal=func(node *TreeNode){
		if node==nil {
			return
		}
		traversal(node.Left)
		if pre!=nil {
			res=int(math.Min(float64(res),float64(node.Val-pre.Val)))
		}
		pre=node
		traversal(node.Right)
	}
	traversal(root)
	return res
}
