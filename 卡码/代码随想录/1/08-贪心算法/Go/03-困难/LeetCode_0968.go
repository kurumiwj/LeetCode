//968. 监控二叉树
package main

import . "greedy/types"

/*
0:无覆盖
1:有摄像头
2:有覆盖
 */
func minCameraCover(root *TreeNode) int {
	res:=0
	var traversal func(root *TreeNode) int
	traversal=func(root *TreeNode) int{
		if root==nil {
			return 2
		}
		left:=traversal(root.Left)
		right:=traversal(root.Right)
		if left==2&&right==2 {
			return 0
		}else if left==0||right==0 {
			res++
			return 1
		}else if left==1||right==1 {
			return 2
		}
		return -1
	}
	if traversal(root)==0 {
		res++
	}
	return res
}
