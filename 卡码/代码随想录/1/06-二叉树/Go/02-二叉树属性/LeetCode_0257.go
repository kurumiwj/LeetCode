//257. 二叉树的所有路径
package main

import (
	"strconv"
	. "binaryTree/types"
)

func traversal(root *TreeNode,path string,res *[]string){
	path+=strconv.Itoa(root.Val)
	//到达叶子节点
	if root.Left==nil && root.Right==nil {
		(*res)=append((*res),path)
		return
	}
	if root.Left!=nil {
		traversal(root.Left,path+"->",res)
	}
	if root.Right!=nil {
		traversal(root.Right,path+"->",res)
	}
}

func binaryTreePaths(root *TreeNode) []string {
	res:=make([]string,0)
	var path string=""
	if root==nil {
		return res
	}
	traversal(root,path,res)
	return res
}
