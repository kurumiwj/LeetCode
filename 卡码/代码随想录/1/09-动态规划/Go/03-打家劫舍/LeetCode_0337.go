// 337. 打家劫舍 III
package main

import (
	"math"
)

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func rob(root *TreeNode) int {
	var traversal func(root *TreeNode) []int
	traversal = func(root *TreeNode) []int {
		if root == nil {
			return []int{0, 0}
		}
		left := traversal(root.Left)
		right := traversal(root.Right)
		//不偷
		v0 := int(math.Max(float64(left[0]), float64(left[1]))) + int(math.Max(float64(right[0]), float64(right[1])))
		//偷
		v1 := left[0] + right[0] + root.Val
		return []int{v0, v1}
	}
	res := traversal(root)
	return int(math.Max(float64(res[0]), float64(res[1])))
}
